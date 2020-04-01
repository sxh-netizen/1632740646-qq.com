/*
Navicat MySQL Data Transfer

Source Server         : shen
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : youxi

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2019-11-28 23:27:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for evalinfo
-- ----------------------------
DROP TABLE IF EXISTS `evalinfo`;
CREATE TABLE `evalinfo` (
  `eid` int(255) NOT NULL auto_increment,
  `uid` int(255) default NULL,
  `gid` int(255) default NULL,
  `econtent` varchar(255) default NULL,
  `edate` varchar(255) default NULL,
  PRIMARY KEY  (`eid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of evalinfo
-- ----------------------------
INSERT INTO `evalinfo` VALUES ('1', '1', '1', '马里奥也太可爱了吧', '2015-11-20');
INSERT INTO `evalinfo` VALUES ('2', '2', '1', '这个游戏厅挺不错的 我很喜欢', '2015-11-21');
INSERT INTO `evalinfo` VALUES ('3', '3', '1', '童年的回忆，记得小时候还是用哪个dvd连着电视游戏手柄玩儿的，现在这么方便', '2015-11-22');
INSERT INTO `evalinfo` VALUES ('4', '1', '1', '真的是童年的回忆了，这个网站有许多小时候玩过的游戏', '2015-11-23');
INSERT INTO `evalinfo` VALUES ('5', '2', '2', '可以锻炼小孩子的智力', '2015-11-24');
INSERT INTO `evalinfo` VALUES ('6', '3', '2', '里面的小鸟和猪都超可爱，很喜欢玩儿这些益智小游戏', '2015-11-24');
INSERT INTO `evalinfo` VALUES ('7', '1', '2', '我觉得这些小游戏很好玩儿，锻炼小孩子的智力，大人拿来娱乐也很好', '2015-11-24');
INSERT INTO `evalinfo` VALUES ('8', '1', '3', '僵尸博士太厉害了吧，打不过', '2015-11-24');
INSERT INTO `evalinfo` VALUES ('9', '3', '3', '僵尸博士太厉害了吧，打不过', '2015-11-24');
INSERT INTO `evalinfo` VALUES ('10', '2', '3', '还有还有，冬瓜好可爱', '2015-11-24');
INSERT INTO `evalinfo` VALUES ('11', '3', '4', '还有还有，冬瓜好可爱', '2015-11-24');
INSERT INTO `evalinfo` VALUES ('12', '2', '4', '还不错，挺好玩的', '2015-11-24');
INSERT INTO `evalinfo` VALUES ('13', '1', '4', '游戏不错，儿子非常喜欢玩', '2016-05-06');
INSERT INTO `evalinfo` VALUES ('14', '2', '5', '朋友推荐的，万里一下感觉蛮不错的', '2018-03-17');
INSERT INTO `evalinfo` VALUES ('15', '3', '5', '游戏不错，儿子非常喜欢玩', '2016-05-06');
INSERT INTO `evalinfo` VALUES ('16', '1', '5', '朋友推荐的，万里一下感觉蛮不错的', '2018-03-17');
INSERT INTO `evalinfo` VALUES ('17', '2', '5', '无聊的时候真的是个不错的选择', '2016-05-06');
INSERT INTO `evalinfo` VALUES ('18', '3', '6', '朋友推荐的，万里一下感觉蛮不错的', '2018-03-17');
INSERT INTO `evalinfo` VALUES ('19', '1', '6', '游戏不错，儿子非常喜欢玩', '2016-05-06');
INSERT INTO `evalinfo` VALUES ('20', '2', '6', '朋友推荐的，万里一下感觉蛮不错的', '2018-03-17');
INSERT INTO `evalinfo` VALUES ('21', '3', '7', '朋友推荐的，万里一下感觉蛮不错的', '2016-05-06');
INSERT INTO `evalinfo` VALUES ('22', '1', '7', '游戏不错，儿子非常喜欢玩', '2018-03-17');
INSERT INTO `evalinfo` VALUES ('23', '1', '7', '朋友推荐的，万里一下感觉蛮不错的', '2017-11-01');
INSERT INTO `evalinfo` VALUES ('24', '2', '8', '游戏不错，儿子非常喜欢玩', '2018-03-17');
INSERT INTO `evalinfo` VALUES ('25', '3', '8', '朋友推荐的，万里一下感觉蛮不错的', '2016-05-06');
INSERT INTO `evalinfo` VALUES ('26', '1', '8', '游戏不错，儿子非常喜欢玩', '2018-03-17');
INSERT INTO `evalinfo` VALUES ('27', '2', '9', '无聊的时候真的是个不错的选择', '2018-03-17');
INSERT INTO `evalinfo` VALUES ('28', '3', '9', '朋友推荐的，万里一下感觉蛮不错的', '2016-05-06');
INSERT INTO `evalinfo` VALUES ('29', '3', '9', '游戏不错，儿子非常喜欢玩', '2017-11-01');
INSERT INTO `evalinfo` VALUES ('30', '2', '10', '朋友推荐的，万里一下感觉蛮不错的', '2018-03-17');
INSERT INTO `evalinfo` VALUES ('31', '1', '10', '无聊的时候真的是个不错的选择', '2016-05-06');
INSERT INTO `evalinfo` VALUES ('32', '2', '1', '朋友推荐的，万里一下感觉蛮不错的', '2017-11-01');
INSERT INTO `evalinfo` VALUES ('33', '1', '1', '游戏不错，儿子非常喜欢玩', '2018-03-17');
INSERT INTO `evalinfo` VALUES ('34', '3', '1', '朋友推荐的，万里一下感觉蛮不错的', '2016-05-06');
INSERT INTO `evalinfo` VALUES ('35', '3', '2', '无聊的时候真的是个不错的选择', '2017-11-01');
INSERT INTO `evalinfo` VALUES ('36', '2', '2', '朋友推荐的，万里一下感觉蛮不错的', '2018-03-17');
INSERT INTO `evalinfo` VALUES ('37', '1', '2', '游戏不错，儿子非常喜欢玩', '2016-05-06');
INSERT INTO `evalinfo` VALUES ('38', '1', '3', '朋友推荐的，万里一下感觉蛮不错的', '2017-11-01');
INSERT INTO `evalinfo` VALUES ('39', '2', '3', '无聊的时候真的是个不错的选择', '2018-03-17');
INSERT INTO `evalinfo` VALUES ('40', '3', '3', '朋友推荐的，万里一下感觉蛮不错的', '2017-11-01');
INSERT INTO `evalinfo` VALUES ('41', '1', '4', '游戏不错，儿子非常喜欢玩', '2018-03-17');
INSERT INTO `evalinfo` VALUES ('42', '2', '4', '朋友推荐的，万里一下感觉蛮不错的', '2018-03-17');
INSERT INTO `evalinfo` VALUES ('43', '3', '5', '无聊的时候真的是个不错的选择', '2017-11-01');
INSERT INTO `evalinfo` VALUES ('44', '2', '5', '朋友推荐的，万里一下感觉蛮不错的', '2018-03-17');
INSERT INTO `evalinfo` VALUES ('45', '1', '5', '无聊的时候真的是个不错的选择', '2016-05-06');
INSERT INTO `evalinfo` VALUES ('46', '3', '5', '游戏不错，儿子非常喜欢玩', '2018-03-17');
INSERT INTO `evalinfo` VALUES ('47', '3', '3', '无聊的时候真的是个不错的选择', '2017-11-01');
INSERT INTO `evalinfo` VALUES ('48', '2', '2', '游戏不错，儿子非常喜欢玩', '2017-11-01');

-- ----------------------------
-- Table structure for gameinfo
-- ----------------------------
DROP TABLE IF EXISTS `gameinfo`;
CREATE TABLE `gameinfo` (
  `gid` int(255) NOT NULL auto_increment,
  `gname` varchar(255) default NULL,
  `gdetail` varchar(255) default NULL,
  `gimg` varchar(255) default NULL,
  `gtype` varchar(255) default NULL,
  `gdate` date default NULL,
  `gprice` float(255,2) default NULL,
  `gshiwan` varchar(255) default NULL,
  `gsingleimg` varchar(255) default NULL,
  `gfile` varchar(255) default NULL,
  `gjianjie` varchar(255) default NULL,
  PRIMARY KEY  (`gid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gameinfo
-- ----------------------------
INSERT INTO `gameinfo` VALUES ('1', '马里奥', '马里奥（Mario）是日本游戏设计师宫本茂设计的一个虚构游戏人物，靠吃蘑菇成长，特征是大鼻子、头戴帽子、身穿背带裤，还留着胡子。他也是任天堂公司的游戏马里奥系列作品中的主角，同时也是该公司的吉祥物。作为任天堂的吉祥物，马里奥被认为是最著名的游戏人物。因为他与其弟路易常被称为“马里奥兄弟”（Mario Bros）。马里奥作为最成功的游戏角色之一，除了典型的《马里奥》游戏系列之外，还经常在赛车、体育和角色扮演等游戏系列中担任主角。', '14.png', '最新', '2019-10-05', '24.00', '/mla', 'maliao.png', '\\mario.zip', '马里奥（Mario）是日本游戏设计师宫本茂设计的一个虚构游戏人物，靠吃蘑菇成长，特征是大鼻子......');
INSERT INTO `gameinfo` VALUES ('2', '愤怒的小鸟', '为了报复偷走鸟蛋的肥猪们，鸟儿以自己的身体为武器，仿佛炮弹一样去攻击肥猪们的堡垒。愤怒的红色小鸟，奋不顾身的往绿色的肥猪的堡垒砸去。游戏的玩法很简单，将弹弓上的小鸟弹出去，砸到绿色的肥猪，将肥猪全部砸到就能过关。鸟儿的弹出角度和力度由玩家的手指来控制，要注意考虑好力度和角度的综合计算，这样才能更准确的砸到肥猪。而被弹出的鸟儿会留下弹射轨迹，可供参考角度和力度的调整。另外每个关卡的分数越多，评价将会越高', '2.jpg', '最新', '2019-06-20', '20.00', 'http://v.bootstrapmb.com/2019/11/jsy4b6647/', 'sin2.jpg', null, '为了报复偷走鸟蛋的肥猪们，鸟儿以自己的身体为武器，仿佛炮弹一样去攻击肥猪们的堡垒。愤怒的红......');
INSERT INTO `gameinfo` VALUES ('3', '公路竞赛', '赛车游戏主要是在比赛场景下进行的，目前该类型的游戏已经在游戏界享有了一定的声誉，爱好赛车竞速游戏的玩家们以体验比赛中的刺激为乐趣，玩家唯一的真实目的就是“最快”。本类型的游戏在操作上极其简单，并没有很多的技术性，另加上独特的赛车设备、优质逼真的比赛画面、仿真的音效，备受游戏玩家们的热捧。', '3.jpg', '最新', '2019-11-04', '67.00', 'http://v.bootstrapmb.com/2019/10/8l96u6433/', 'sin1.jpg', null, '赛车游戏主要是在比赛场景下进行的，目前该类型的游戏已经在游戏界享有了一定的声誉，爱好赛车竞速......');
INSERT INTO `gameinfo` VALUES ('4', '神庙逃亡', '《神庙逃亡》游戏内容和大多数跑酷游戏都非常相似,越过重重障碍和陷阱,不断向前飞奔.不过在神庙逃亡里玩家控制的是一个印第安纳琼斯似的人物,在热带雨林的某个古老神庙中逃出,被神庙中一群猴子模样的恶魔守卫追赶.人物是自动不断向前飞奔的,而玩家则需要控制他避开逃亡路上遇到的各种危险.不过和大多数跑酷游戏不同的是,游戏并未采用常见的2D横版画面,取而代之的是全3D的第三人称视角。', '4.jpg', '最受欢迎', '2019-10-20', '1.00', 'http://v.bootstrapmb.com/2019/8/g72rs5700/', 'shemiaotaowang.png', null, '《神庙逃亡》游戏内容和大多数跑酷游戏都非常相似,越过重重障碍和陷阱,不断向前飞奔.不过在......');
INSERT INTO `gameinfo` VALUES ('5', '狂暴飙车', '狂暴飙车：游戏名称。游戏类型：体育类。1背景设定编辑\r\n午夜来临，你驾车来到了高速上，因为超速行驶遭到了警察们围追堵截，所以赶紧驾驶汽车在高速上极速飞奔，撞飞阻挡你的警车，体验这场激情的狂暴飙车吧，喜欢赛车小游戏的朋友千万别错过了！', '5.jpg', '最受欢迎', '2019-11-20', '1.00', null, null, null, '午夜来临，你驾车来到了高速上，因为超速行驶遭到了警察们围追堵截，......');
INSERT INTO `gameinfo` VALUES ('6', '拳皇2008', '拳皇》是1994年日本SNK公司旗下在MVS游戏机板上发售的一款著名对战型格斗街机游戏，简称\"KOF\"，也是在剧情中举行的世界规模的格斗大赛的名称。最初为该公司旗下另外两部作品《饿狼传说》系列和《龙虎之拳2》中以南镇为舞台举办的格斗大赛。\r\n【KOF】为官方的简称，取自每个单词的首字母。商标注册于SNK公司的名下。中国大陆和香港称\"拳皇\"。游戏官方公认的中译名为\"拳皇\"(可从SNK Playmore香港官网或部份系列作中的部份背景的文字得知)。台湾译为\"格斗之王\"，则是来自当初游戏机台招式贴纸的译名。', '6.jpg', '最受欢迎', '2019-10-20', '1.00', 'http://v.bootstrapmb.com/2018/11/mgwh32748/', null, null, '【KOF】为官方的简称，取自每个单词的首字母。商标注册于SNK公司的名下。中国大陆和......');
INSERT INTO `gameinfo` VALUES ('7', '街头霸王', '街头霸王常常被列入游戏史上最伟大的电子游戏之一。它广泛地被认为是格斗游戏的先驱，并仍然被很多纯粹主义者认为是该类作品当中最优秀的例子，因它更注重操纵性及可玩性，而不依靠图像和动画。特别是其操纵系统，其后的游戏常常模仿它的系统，包括其他CAPCOM的格斗游戏。空手道和初代的街头霸王，这两款于街头霸王2之前发行的单对单格斗游戏，已经逐渐为人淡忘，尽管街霸2不是历史上第一款格斗游戏，但它却是后来所有格斗游戏的基础，后来的几乎所有格斗游戏都遵循了街霸2的各种设定。', '7.jpg', '特色', '2019-11-20', '1.00', 'http://v.bootstrapmb.com/2018/10/0x80m2621/', null, null, '街头霸王常常被列入游戏史上最伟大的电子游戏之一。它广泛地被认为是格斗游戏......');
INSERT INTO `gameinfo` VALUES ('8', '功夫熊猫', '突然到访的怪物，开始肆意破坏。熊猫村派出他们最强熊猫武器阻挡了怪物们袭击；怪物们被击退了，大家都在欢呼，可是熊猫村的大长老却发现这世界已被某种力量改变了。原本和平的世界开始骚动起来，动物变的凶残起来。为了平息此事，熊猫村派出了他们的侠客。', '8.jpg', '特色', '2012-12-17', '1.00', 'http://v.bootstrapmb.com/2019/8/so33e5874/', 'sin.jpg', null, '突然到访的怪物，开始肆意破坏。熊猫村派出他们最强熊猫武器阻挡了怪物们袭击；怪......');
INSERT INTO `gameinfo` VALUES ('9', '植物大战僵尸', '植物大战僵尸》（外文名：Plants vs. Zombies）是一款益智策略类塔防单机游戏，由PopCap Games开发，于2009年5月5日发售。该游戏支持Windows、Mac OS X、xbox 360及iOS系统平台。\r\n\r\n该游戏中玩家通过武装多种植物切换不同的功能，快速有效地把僵尸阻挡在入侵的道路上。不同的敌人，不同的玩法构成五种不同的游戏模式，加之黑夜、浓雾以及泳池之类的障碍增加了游戏挑战性。', '9.jpg', '特色', '2019-11-20', '1.00', 'file:///D:/Documents/Tencent%20Files/2934391688/FileRecv/%E6%B8%B8%E6%88%8F/%E6%A4%8D%E7%89%A9%E5%A4%A7%E6%88%98%E5%83%B5%E5%B0%B8/zwdzjs/index.html', 'zhiwudazhanjiangshi.png', '\\file\\ZW.rar', '该游戏中玩家通过武装多种植物切换不同的功能，快速有效地把僵尸阻挡在......');
INSERT INTO `gameinfo` VALUES ('13', '坦克大战', '《坦克大战》是由日本南梦宫Namco游戏公司开发的一款平面射击游戏，于1985年发售。游戏以坦克战斗及保卫基地为主题，属于策略型联机类。\r\n\r\n同时也是FC平台上少有的内建关卡编辑器的几个游戏之一，玩家可自己创建独特的关卡，并通过获取一些道具使坦克和基地得到强化。', '10.jpg', '最受欢迎', '2019-11-19', '1.00', '/tkdz', null, '\\file\\tkdz.zip', '《坦克大战》是由日本南梦宫Namco游戏公司开发的一款平面射击游戏，于1985年发售。......');
INSERT INTO `gameinfo` VALUES ('14', '坦克世界', '《坦克世界》是一款在2010年由Wargaming公司推出的战争网游。于2010年10月30日在俄罗斯首发，2011年4月12日在北美和欧洲推出，2011年3月15日在中国由空中网代理推出。\r\n游戏背景设定在二战时期，玩家会扮演1930到1960年代的战车进行对战，要求战略和合作性。游戏中的战车根据历史高度还原。 [1]  2017年，获得英国金摇杆奖“仍然在玩游戏奖”。', '11.jpg', '特色', '2019-11-13', '1.00', 'http://v.bootstrapmb.com/2019/8/gcp95812/', null, null, '游戏背景设定在二战时期，玩家会扮演1930到1960年代的战车进行对战，要求战略和合作性......');
INSERT INTO `gameinfo` VALUES ('15', '功夫小鸡', '功夫鸡的创意诞生于一群长期制作欧美加工片的中国动漫青年的火花碰撞中，最初仅是为了用中国元素向世界展示中国功夫；2008年团队开始累积功夫鸡前期创作，2010年功夫鸡最早的片花问世，得到国内外专业人士的认可，2012年-2014年功夫鸡动画在市场认可和细致打磨中逐渐成型，相信这将是国产动漫逆袭的强有力代表。', '12.jpg', '最新', '2019-11-20', '1.00', '/gongfuji', 'gongfuji.png', null, '功夫鸡的创意诞生于一群长期制作欧美加工片的中国动漫青年的火花碰撞中，最初仅是为了用中国元.....');
INSERT INTO `gameinfo` VALUES ('16', '水果忍者', '《水果忍者》（Fruit Ninja），是由澳大利亚公司Halfbrick Studios开发的一款休闲益智类游戏，于2010年4月20日在iOS平台推出。《水果忍者》这款游戏的创意来源也非常简单，就是一位员工在家里看到电视播放销售水果刀的广告，为了体现出刀的锋利，广告里推销员把香蕉抛向空中，然后用水果刀在空中把香蕉切开。', '13.png', '最新', '2019-11-14', '1.00', 'http://v.bootstrapmb.com/2019/4/g5qi3894/', null, null, '《水果忍者》（Fruit Ninja），是由澳大利亚公司Halfbrick Studios开发的一款休闲益智类游戏...');
INSERT INTO `gameinfo` VALUES ('17', '地铁跑酷', '该游戏是一款堪比神庙逃亡的经典跑酷游戏。游戏的画面绚丽精致，色彩繁多让人感觉很舒服，在操作上非常顺畅，并且干净利落。通过简单的向上划，向下划，向左向右划来躲避障碍和迎面而来的火车，帮助主人公躲避脾气暴躁的警察和他的狗的追捕。在空中也可以左右改变方向，还可以通过双击屏幕调出滑板，在有限的时间里相当于增加一次生命。游戏中还包含了如弹簧鞋等多种道具。', '1.jpg', '特色', '2019-11-08', '1.00', null, null, null, '该游戏是一款堪比神庙逃亡的经典跑酷游戏。游戏的画面绚丽精致，色彩繁多让人感觉很舒.....');
INSERT INTO `gameinfo` VALUES ('18', '像素小鸟', '越南小子制作的《Flappy Bird》火了，风靡全球的《像素小鸟（中文版）》终于来啦！只需要触摸屏幕让鸟儿飞翔，本款是一形式简易但难度极高的休闲游戏。同时也是一款令人发指的火爆小游戏。快来引爆奇葩点！挑战极虐底线！\r\n简单易懂的小游戏，有着神奇般魔力的《像素小鸟》让人又爱又恨怒放豪气的冲动，舒缓压力山大的工作压力，释放正能量闯天下，行动吧！', '15.png', '最受欢迎', '2019-11-06', '1.00', 'http://v.bootstrapmb.com/2019/5/96ry34993/', null, '\\file\\xiangsuxiaoniao.zip', '越南小子制作的《Flappy Bird》火了，风靡全球的《像素小鸟（中文版）》终于来啦！...');
INSERT INTO `gameinfo` VALUES ('23', 'giao射击', '射击游戏', '16.jpg', '最新', '2019-11-28', '1.00', 'http://v.bootstrapmb.com/2019/8/wrqem5811/', null, null, '射击射击射击射击.....射击射击射击射击.....射击射击射击射击.....射击射击射击射击.....');
INSERT INTO `gameinfo` VALUES ('24', '机甲射击', '66666666666666666666', '17.png', '最新', '2019-11-28', '1.00', 'http://v.bootstrapmb.com/2019/8/0ay3p5690/', null, null, '小机甲小机甲机......小机甲小机甲机......小机甲小机甲机......小机甲小机甲机......小机甲小机甲机......');
INSERT INTO `gameinfo` VALUES ('25', '忍者游戏', '小忍者小忍者小忍者', '18.png', '最热', '2019-11-07', '1.00', 'http://v.bootstrapmb.com/2019/8/m22785849/', null, null, '小忍者小忍者小忍.......小忍者小忍者小忍.......小忍者小忍者小忍.......小忍者小忍者小忍.......');
INSERT INTO `gameinfo` VALUES ('26', '越野车', '越野吧giaogiaogiao', '19.png', '特色', '2019-11-07', '1.00', 'http://v.bootstrapmb.com/2019/9/ae295953/ ', null, null, '越野吧giaogiaogiao越野吧giaogiaogiao越野吧giaogiaogiao越野吧giaogiaogiao');

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `uid` int(255) NOT NULL auto_increment,
  `uname` varchar(255) default NULL,
  `upwd` varchar(255) default NULL,
  `uphone` varchar(255) default NULL,
  `urealname` varchar(255) default NULL,
  `ustyle` varchar(255) default NULL,
  `usex` int(255) default NULL,
  `uemail` varchar(255) default NULL,
  `uaddress` varchar(255) default NULL,
  `ucreatedate` date default NULL,
  `ustate` varchar(255) default NULL,
  PRIMARY KEY  (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('1', 'zhangsan', '123', '13673759163', '张三', '超级管理员', '1', '1632740646@qq.com', '河南省郑州市', '2019-12-13', '已启用');
INSERT INTO `userinfo` VALUES ('2', 'lisi', '123', '15137511977', '李四', '用户', '2', '13137511977@163.com', '河南省天津市', '2019-12-10', '已启用');
INSERT INTO `userinfo` VALUES ('3', 'wangyao', '123456', '110', 'wangyao', '用户', '2', '1967175616@qq.com', 'henan', '2019-11-28', '已启用');
INSERT INTO `userinfo` VALUES ('16', '李硕', '666', null, '李giao', '用户', '2', '374760798@qq.com', '河南新乡', '2019-11-28', '已启用');
INSERT INTO `userinfo` VALUES ('17', '', '', '', 'l', null, '1', '66666666@qq.com', '', '2019-11-28', '已启用');
