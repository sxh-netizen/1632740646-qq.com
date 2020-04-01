package com.er;



import com.er.utils.GsonUtils;
import com.er.utils.HttpUtil;

import java.util.*;

/**
 * 人脸搜索
 */
public class FaceSearch {

    /**
     * 重要提示代码中所需工具类
     * FileUtil,Base64Util,HttpUtil,GsonUtils请从
     * https://ai.baidu.com/file/658A35ABAB2D404FBF903F64D47C1F72
     * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
     * https://ai.baidu.com/file/544D677F5D4E4F17B4122FBD60DB82B3
     * https://ai.baidu.com/file/470B3ACCA3FE43788B5A963BF0B625F3
     * 下载
     */
    public  String search(String image) {
        // 请求url
        String url = "https://aip.baidubce.com/rest/2.0/face/v3/search";
        try {
            Map<String, Object> map = new HashMap<>();
            // 图片的 base64数据  , 你的人脸图片base64编码
            map.put("image", image);
            // 活体检测用的...  不用管
            map.put("liveness_control", "NORMAL");
            // 指定组中的 grop 中的 人脸
            map.put("group_id_list", "wode");
            // 图片类型    转换过的 base64
            map.put("image_type", "BASE64");
            // 图片质量控制
            map.put("quality_control", "LOW");

            String param = GsonUtils.toJson(map);
            String accessToken = AuthService.getAuth();
            // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
          // String accessToken = "[调用鉴权接口获取的token]";

            String result = HttpUtil.post(url, accessToken, "application/json", param);
             String score= result.split(",")[9].split(":")[1];
            System.out.println(result);
            return score;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}