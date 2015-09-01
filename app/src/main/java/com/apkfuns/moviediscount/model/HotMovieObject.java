package com.apkfuns.moviediscount.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by baidu on 15/8/29.
 */
public class HotMovieObject implements Serializable {

    /**
     * lid : 290
     * bImg : http://img31.mtime.cn/mg/2015/08/25/170824.80972182.jpg
     * date : 2015-08-29
     * totalComingMovie : 52
     * newActivitiesTime : 0
     * ms : [{"id":106560,"t":"终结者：创世纪","tCn":"终结者：创世纪","tEn":"Terminator Genisys","r":7.4,"rc":4319,"img":"http://img31.mtime.cn/mt/2015/08/26/094552.75912154_1280X720X2.jpg","dN":"艾伦·泰勒","aN1":"阿诺·施瓦辛格","aN2":"艾米莉亚·克拉克","p":["动作","冒险","科幻","惊悚"],"rd":"20150823","d":"126分钟","cC":128,"sC":2487,"rsC":0,"NearestCinemaCount":128,"NearestShowtimeCount":1367,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":true,"isTicket":true,"commonSpecial":"各种挥泪致敬经典","wantedCount":7324,"movieType":"动作 | 冒险 | 科幻","is3D":true,"isIMAX":false,"isIMAX3D":true,"isDMAX":true,"versions":[{"enum":2,"version":"3D"},{"enum":4,"version":"IMAX3D"},{"enum":6,"version":"中国巨幕"}]},{"id":225744,"t":"百团大战","tCn":"百团大战","tEn":"The Hundred Regiments Offensive","r":5,"rc":304,"img":"http://img31.mtime.cn/mt/2015/08/03/153244.12615862_1280X720X2.jpg","dN":"宁海强","aN1":"陶泽如","aN2":"刘之冰","p":["剧情","战争"],"rd":"20150828","d":"111分钟","cC":110,"sC":1061,"rsC":0,"NearestCinemaCount":101,"NearestShowtimeCount":475,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"重回烽火的年代 ","wantedCount":488,"movieType":"剧情 | 战争","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":true,"versions":[{"enum":6,"version":"中国巨幕"}]},{"id":200714,"t":"烈日灼心","tCn":"烈日灼心","tEn":"The Dead End","r":8,"rc":1415,"img":"http://img31.mtime.cn/mt/2015/08/07/101118.96422462_1280X720X2.jpg","dN":"曹保平","aN1":"邓超","aN2":"段奕宏","p":["剧情","悬疑","犯罪"],"rd":"20150827","d":"139分钟","cC":129,"sC":2028,"rsC":0,"NearestCinemaCount":129,"NearestShowtimeCount":1068,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":true,"isTicket":true,"commonSpecial":"震撼到失语","wantedCount":2229,"movieType":"剧情 | 悬疑 | 犯罪","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":49650,"t":"刺客聂隐娘","tCn":"刺客聂隐娘","tEn":"The Assassin","r":7.5,"rc":1314,"img":"http://img31.mtime.cn/mt/2015/08/12/095013.25411033_1280X720X2.jpg","dN":"侯孝贤","aN1":"舒淇","aN2":"张震","p":["动作","剧情"],"rd":"20150827","d":"104分钟","cC":121,"sC":1283,"rsC":0,"NearestCinemaCount":121,"NearestShowtimeCount":712,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":true,"isTicket":true,"commonSpecial":"极美到不敢呼吸","wantedCount":3681,"movieType":"动作 | 剧情","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":221923,"t":"滚蛋吧！肿瘤君","tCn":"滚蛋吧！肿瘤君","tEn":"Go Away Mr. Tumour","r":7.4,"rc":4899,"img":"http://img31.mtime.cn/mt/2015/07/29/142003.58629160_1280X720X2.jpg","dN":"韩延","aN1":"白百何","aN2":"吴彦祖","p":["爱情","剧情"],"rd":"20150813","d":"120分钟","cC":103,"sC":630,"rsC":0,"NearestCinemaCount":101,"NearestShowtimeCount":362,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"阿祖酱油打的也是帅帅的","wantedCount":3601,"movieType":"爱情 | 剧情","is3D":false,"isIMAX":true,"isIMAX3D":false,"isDMAX":true,"versions":[{"enum":3,"version":"IMAX"},{"enum":6,"version":"中国巨幕"}]},{"id":203067,"t":"三城记","tCn":"三城记","tEn":"Tale of Three Cities","r":6.6,"rc":179,"img":"http://img31.mtime.cn/mt/2015/08/21/104639.97447269_1280X720X2.jpg","dN":"张婉婷","aN1":"刘青云","aN2":"汤唯","p":["爱情","剧情"],"rd":"20150827","d":"130分钟","cC":98,"sC":425,"rsC":0,"NearestCinemaCount":96,"NearestShowtimeCount":243,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"姐弟恋是不分时代的","wantedCount":1296,"movieType":"爱情 | 剧情","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":211794,"t":"捉妖记","tCn":"捉妖记","tEn":"Monster Hunt","r":7.3,"rc":11086,"img":"http://img31.mtime.cn/mt/2015/06/24/095659.10934613_1280X720X2.jpg","dN":"许诚毅","aN1":"井柏然","aN2":"白百何","p":["奇幻","喜剧"],"rd":"20150716","d":"118分钟","cC":60,"sC":247,"rsC":0,"NearestCinemaCount":60,"NearestShowtimeCount":146,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"小哇演什么都是个大boss","wantedCount":12485,"movieType":"奇幻 | 喜剧","is3D":true,"isIMAX":false,"isIMAX3D":true,"isDMAX":true,"versions":[{"enum":2,"version":"3D"},{"enum":4,"version":"IMAX3D"},{"enum":6,"version":"中国巨幕"}]},{"id":225955,"t":"魔镜奇缘","tCn":"魔镜奇缘","tEn":"Enchanted Mirror Romance","r":-1,"rc":31,"img":"http://img31.mtime.cn/mt/2015/08/18/084818.48257943_1280X720X2.jpg","dN":"郑成峰","aN1":"","aN2":"","p":["动画","奇幻","冒险"],"rd":"20150903","d":"81分钟","cC":61,"sC":200,"rsC":0,"NearestCinemaCount":58,"NearestShowtimeCount":132,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"","wantedCount":175,"movieType":"动画 | 奇幻 | 冒险","is3D":true,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[{"enum":2,"version":"3D"}]},{"id":209164,"t":"西游记之大圣归来","tCn":"西游记之大圣归来","tEn":"Monkey King: Hero is Back","r":8.2,"rc":23306,"img":"http://img31.mtime.cn/mt/2015/07/09/163517.42772274_1280X720X2.jpg","dN":"田晓鹏","aN1":"张磊","aN2":"林子杰","p":["动画","动作","奇幻"],"rd":"20150710","d":"85分钟","cC":66,"sC":220,"rsC":0,"NearestCinemaCount":66,"NearestShowtimeCount":121,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"四大天王到底是男是女","wantedCount":12087,"movieType":"动画 | 动作 | 奇幻","is3D":true,"isIMAX":false,"isIMAX3D":false,"isDMAX":true,"versions":[{"enum":2,"version":"3D"},{"enum":6,"version":"中国巨幕"}]},{"id":226594,"t":"这里的黎明静悄悄","tCn":"这里的黎明静悄悄","tEn":"The Dawns Here Are Quiet","r":7,"rc":2938,"img":"http://img31.mtime.cn/mt/2015/07/31/143304.55227503_1280X720X2.jpg","dN":"列纳特·达夫列吉亚罗","aN1":"皮欧特·费奥多罗夫","aN2":"叶芙根尼娅·马拉霍娃","p":["剧情","战争"],"rd":"20150825","d":"115分钟","cC":30,"sC":201,"rsC":0,"NearestCinemaCount":29,"NearestShowtimeCount":72,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"静谧森林的较量","wantedCount":8962,"movieType":"剧情 | 战争","is3D":true,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[{"enum":2,"version":"3D"}]},{"id":223146,"t":"洛克王国大电影4：出发！巨人谷","tCn":"洛克王国大电影4：出发！巨人谷","tEn":"Roco Kingdom 4","r":5.6,"rc":206,"img":"http://img31.mtime.cn/mt/2015/07/31/100835.12096194_1280X720X2.jpg","dN":"Hugues Martel","aN1":"张琦","aN2":"胡夏","p":["动画","奇幻","冒险"],"rd":"20150813","d":"86分钟","cC":39,"sC":106,"rsC":0,"NearestCinemaCount":37,"NearestShowtimeCount":66,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"中国版神奇宝贝","wantedCount":864,"movieType":"动画 | 奇幻 | 冒险","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":227475,"t":"诱狼","tCn":"诱狼","tEn":"Entrapment","r":5.8,"rc":78,"img":"http://img31.mtime.cn/mt/2015/08/17/095844.38825380_1280X720X2.jpg","dN":"安澜","aN1":"巩峥","aN2":"侯勇","p":["动作","战争"],"rd":"20150825","d":"95分钟","cC":20,"sC":67,"rsC":0,"NearestCinemaCount":19,"NearestShowtimeCount":60,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"没有不可战胜的神话","wantedCount":58,"movieType":"动作 | 战争","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":225721,"t":"黑猫警长之翡翠之星","tCn":"黑猫警长之翡翠之星","tEn":"Mr.Black: Green Star","r":5.3,"rc":532,"img":"http://img31.mtime.cn/mt/2015/07/20/175408.50367609_1280X720X2.jpg","dN":"于胜军","aN1":"赵路","aN2":"吴天昊","p":["动画","动作","科幻","喜剧"],"rd":"20150807","d":"83分钟","cC":26,"sC":78,"rsC":0,"NearestCinemaCount":26,"NearestShowtimeCount":43,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"白猫警长在天上会哭的","wantedCount":1251,"movieType":"动画 | 动作 | 科幻","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":215341,"t":"新娘大作战","tCn":"新娘大作战","tEn":"Bride Wars","r":4.9,"rc":1326,"img":"http://img31.mtime.cn/mt/2015/07/22/113136.54331603_1280X720X2.jpg","dN":"陈国辉","aN1":"杨颖","aN2":"倪妮","p":["剧情","喜剧"],"rd":"20150820","d":"90分钟","cC":20,"sC":81,"rsC":0,"NearestCinemaCount":18,"NearestShowtimeCount":43,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"剧情不够颜值凑","wantedCount":2393,"movieType":"剧情 | 喜剧","is3D":true,"isIMAX":false,"isIMAX3D":false,"isDMAX":true,"versions":[{"enum":2,"version":"3D"},{"enum":6,"version":"中国巨幕"}]},{"id":227412,"t":"诡劫","tCn":"诡劫","tEn":"Doomed Disaste","r":6.1,"rc":321,"img":"http://img31.mtime.cn/mt/2015/08/17/153720.68062425_1280X720X2.jpg","dN":"杨竞泽","aN1":"佟丽娅","aN2":"立威廉","p":["惊悚","恐怖"],"rd":"20150828","d":"90分钟","cC":32,"sC":54,"rsC":0,"NearestCinemaCount":31,"NearestShowtimeCount":35,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"大提琴箱子还有人敢提吗","wantedCount":9810,"movieType":"惊悚 | 恐怖","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":207597,"t":"我是奋青","tCn":"我是奋青","tEn":"Fighting Youth","r":4.7,"rc":53,"img":"http://img31.mtime.cn/mt/2015/08/10/102011.77912577_1280X720X2.jpg","dN":"鸿水","aN1":"孙坚","aN2":"毛晓彤","p":["爱情","喜剧"],"rd":"20150828","cC":17,"sC":44,"rsC":0,"NearestCinemaCount":17,"NearestShowtimeCount":33,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"青春还在笑着盛开","wantedCount":221,"movieType":"爱情 | 喜剧","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":220081,"t":"桂宝之爆笑闯宇宙","tCn":"桂宝之爆笑闯宇宙","tEn":"Kwai Boo","r":5.2,"rc":339,"img":"http://img31.mtime.cn/mt/2015/07/29/142146.87683935_1280X720X2.jpg","dN":"王云飞","aN1":"王云飞","aN2":"阿桂","p":["动画","科幻","喜剧"],"rd":"20150806","d":"95分钟","cC":24,"sC":38,"rsC":0,"NearestCinemaCount":22,"NearestShowtimeCount":26,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"合家欢的冒险旅程","wantedCount":943,"movieType":"动画 | 科幻 | 喜剧","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":226575,"t":"犹太女孩在上海2\u2014\u2014项链密码","tCn":"犹太女孩在上海2\u2014\u2014项链密码","tEn":"A Jewish Girl in Shanghai Part2- The Mystery of The Necklace","r":6.9,"rc":11,"img":"http://img31.mtime.cn/mt/2015/08/25/095548.33145852_1280X720X2.jpg","dN":"姚光华","aN1":"","aN2":"","p":["动画","剧情"],"rd":"20150828","cC":13,"sC":19,"rsC":0,"NearestCinemaCount":13,"NearestShowtimeCount":14,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"国际友人大团结","wantedCount":183,"movieType":"动画 | 剧情","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":218762,"t":"煎饼侠","tCn":"煎饼侠","tEn":"Jian Bing Man","r":6.7,"rc":9983,"img":"http://img31.mtime.cn/mt/2015/06/29/100849.10734933_1280X720X2.jpg","dN":"大鹏","aN1":"大鹏","aN2":"袁姗姗","p":["喜剧"],"rd":"20150717","d":"113分钟","cC":13,"sC":28,"rsC":0,"NearestCinemaCount":10,"NearestShowtimeCount":14,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"自黑乃喜剧屡试不爽之计","wantedCount":9328,"movieType":"喜剧","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":223912,"t":"白雪公主之神秘爸爸","tCn":"白雪公主之神秘爸爸","tEn":"Snow White: The Mysterious Father","r":4.1,"rc":102,"img":"http://img31.mtime.cn/mt/2015/07/23/145902.47046804_1280X720X2.jpg","dN":"赵奔","aN1":"","aN2":"","p":["动画","家庭","冒险","喜剧"],"rd":"20150814","d":"77分钟","cC":10,"sC":14,"rsC":0,"NearestCinemaCount":10,"NearestShowtimeCount":11,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"白雪公主也开始找爹了","wantedCount":305,"movieType":"动画 | 家庭 | 冒险","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":226862,"t":"双生灵","tCn":"双生灵","tEn":"","r":5.5,"rc":66,"img":"http://img31.mtime.cn/mt/2015/07/27/111533.93445332_1280X720X2.jpg","dN":"秦臻","aN1":"车艺莲","aN2":"常奕然","p":["恐怖"],"rd":"20150821","d":"93分钟","cC":4,"sC":8,"rsC":0,"NearestCinemaCount":4,"NearestShowtimeCount":6,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"鬼片最爱双胞胎","wantedCount":134,"movieType":"恐怖","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":218576,"t":"恋爱中的城市","tCn":"恋爱中的城市","tEn":"Cities In Love","r":6.2,"rc":1541,"img":"http://img31.mtime.cn/mt/2015/08/19/144827.52328664_1280X720X2.jpg","dN":"文牧野","aN1":"杨幂","aN2":"郑开元","p":["爱情"],"rd":"20150820","d":"117分钟","cC":3,"sC":8,"rsC":0,"NearestCinemaCount":2,"NearestShowtimeCount":5,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"白老师还和谁不搭？\n","wantedCount":1536,"movieType":"爱情","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":225198,"t":"七月半之恐怖宿舍","tCn":"七月半之恐怖宿舍","tEn":"Mid-July Days","r":4.8,"rc":185,"img":"http://img31.mtime.cn/mt/2015/08/11/100748.85449356_1280X720X2.jpg","dN":"杜潇傲","aN1":"余心恬","aN2":"马元","p":["恐怖"],"rd":"20150814","d":"93分钟","cC":3,"sC":7,"rsC":0,"NearestCinemaCount":3,"NearestShowtimeCount":5,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"学生放假鬼跟自己玩么\n","wantedCount":344,"movieType":"恐怖","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":225287,"t":"战火中的芭蕾","tCn":"战火中的芭蕾","tEn":"Ballet in the Flames of War","r":6.5,"rc":42,"img":"http://img31.mtime.cn/mt/2015/08/12/153154.98380819_1280X720X2.jpg","dN":"尼基塔·米哈尔科夫","aN1":"曹舒慈","aN2":"伊戈尔·卡列斯科夫","p":["剧情"],"rd":"20150821","d":"100分钟","cC":5,"sC":6,"rsC":0,"NearestCinemaCount":3,"NearestShowtimeCount":3,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"树林里的芭蕾片段美翻了","wantedCount":103,"movieType":"剧情","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":126700,"t":"神奇侠侣","tCn":"神奇侠侣","tEn":"Mr. and Mrs. Incredible","r":5.5,"rc":5803,"img":"http://img21.mtime.cn/mt/2010/09/21/171413.51430914_1280X720X2.jpg","dN":"谷德昭","aN1":"古天乐","aN2":"吴君如","p":["喜剧"],"rd":"20110203","cC":1,"sC":2,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":2,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":false,"commonSpecial":"","wantedCount":3041,"movieType":"喜剧","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":223891,"t":"美人鱼之海盗来袭","tCn":"美人鱼之海盗来袭","tEn":"The Little Mermaid: Attack of The Pirates","r":5.2,"rc":559,"img":"http://img31.mtime.cn/mt/2015/07/14/092716.76990212_1280X720X2.jpg","dN":"邱浩强","aN1":"","aN2":"","p":["动画","冒险","喜剧"],"rd":"20150731","d":"85分钟","cC":2,"sC":4,"rsC":0,"NearestCinemaCount":2,"NearestShowtimeCount":2,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"人鱼小姐化身正义使者","wantedCount":1086,"movieType":"动画 | 冒险 | 喜剧","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":224523,"t":"赛尔号大电影5：雷神崛起","tCn":"赛尔号大电影5：雷神崛起","tEn":"Seer 5","r":5.3,"rc":1581,"img":"http://img31.mtime.cn/mt/2015/07/13/141552.43175842_1280X720X2.jpg","dN":"王章俊","aN1":"罗玉婷","aN2":"翟巍","p":["动画","剧情","冒险"],"rd":"20150723","d":"90分钟","cC":1,"sC":2,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":2,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"小米就是皮卡丘","wantedCount":1173,"movieType":"动画 | 剧情 | 冒险","is3D":true,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[{"enum":2,"version":"3D"}]},{"id":104455,"t":"锦衣卫","tCn":"锦衣卫","tEn":"14 Blades","r":6.5,"rc":26837,"img":"http://img31.mtime.cn/mt/2012/08/26/114429.70997404_1280X720X2.jpg","dN":"李仁港","aN1":"甄子丹","aN2":"赵薇","p":["惊悚","剧情","动作"],"rd":"20100203","cC":1,"sC":1,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":false,"commonSpecial":"","wantedCount":5708,"movieType":"惊悚 | 剧情 | 动作","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":55024,"t":"大电影2.0之两个傻瓜的荒唐事","tCn":"大电影2.0之两个傻瓜的荒唐事","tEn":"Two Stupid Eggs","r":5.7,"rc":3315,"img":"http://img31.mtime.cn/mt/2014/02/23/041623.61702118_1280X720X2.jpg","dN":"阿甘","aN1":"姚晨","aN2":"王宝强","p":["喜剧"],"rd":"20071221","cC":1,"sC":1,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":false,"commonSpecial":"","wantedCount":329,"movieType":"喜剧","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":210859,"t":"丛林有情狼3","tCn":"丛林有情狼3","tEn":"Alpha and Omega 3: The Great Wolf Games","r":-1,"rc":5,"img":"http://img31.mtime.cn/mt/2014/04/21/104417.65863586_1280X720X2.jpg","dN":"Richard Rich","aN1":"Ben Diskin","aN2":"Dee Dee Greene","p":["动画","家庭","动作","冒险","喜剧"],"rd":"20140325","d":"54分钟","cC":1,"sC":1,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":false,"commonSpecial":"","wantedCount":24,"movieType":"动画 | 家庭 | 动作","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":130663,"t":"假装情侣","tCn":"假装情侣","tEn":"The Pretending Lovers","r":6.6,"rc":3104,"img":"http://img21.mtime.cn/mt/2011/06/02/103018.20296142_1280X720X2.jpg","dN":"刘奋斗","aN1":"黄渤","aN2":"江一燕","p":["爱情","喜剧"],"rd":"20110624","cC":1,"sC":1,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":false,"commonSpecial":"","wantedCount":1030,"movieType":"爱情 | 喜剧","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":182324,"t":"冰雪女王","tCn":"冰雪女王","tEn":"Snezhnaya koroleva","r":6.5,"rc":145,"img":"http://img31.mtime.cn/mt/2015/08/03/164319.49435231_1280X720X2.jpg","dN":"Vlad Barbe","aN1":"刘纯燕","aN2":"霍尊","p":["动画","奇幻"],"rd":"20150803","d":"80分钟","cC":1,"sC":1,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"战斗民族的冰雪奇缘","wantedCount":580,"movieType":"动画 | 奇幻","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":98447,"t":"老五的奥斯卡","tCn":"老五的奥斯卡","tEn":"Lao Wu's Oscar","r":5.6,"rc":119,"img":"http://img31.mtime.cn/mt/2014/02/23/070043.26804686_1280X720X2.jpg","dN":"李克龙","aN1":"李易祥","aN2":"魏宗万","p":["爱情","喜剧"],"rd":"20090206","cC":1,"sC":1,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":false,"commonSpecial":"","wantedCount":40,"movieType":"爱情 | 喜剧","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":172885,"t":"王子与108煞","tCn":"王子与108煞","tEn":"The Prince and the 108 Demons","r":5.4,"rc":166,"img":"http://img31.mtime.cn/mt/2015/08/04/092216.68246818_1280X720X2.jpg","dN":"帕斯卡·莫莱利","aN1":"Lucien Jean-Baptiste","aN2":"Bertrand Nadler","p":["动画"],"rd":"20150821","d":"104分钟","cC":1,"sC":1,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"又一西方眼中的东方故事","wantedCount":168,"movieType":"动画","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":31065,"t":"生死决","tCn":"生死决","tEn":"Duel to the Death","r":7.7,"rc":117,"img":"http://img31.mtime.cn/mt/2015/08/10/152702.65833153_1280X720X2.jpg","dN":"程小东","aN1":"徐少强","aN2":"刘松仁","p":["动作","剧情"],"rd":"19830113","cC":1,"sC":1,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":false,"commonSpecial":"","wantedCount":42,"movieType":"动作 | 剧情","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":118749,"t":"心跳戈壁","tCn":"心跳戈壁","tEn":"Wild Desert","r":6.1,"rc":415,"img":"http://img31.mtime.cn/mt/2015/08/18/092551.85817870_1280X720X2.jpg","dN":"甄人","aN1":"董璇","aN2":"邵兵","p":["剧情"],"rd":"20150827","d":"98分钟","cC":1,"sC":2,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":false,"commonSpecial":"沙漠版速度与激情","wantedCount":273,"movieType":"剧情","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":16304,"t":"少林三十六房","tCn":"少林三十六房","tEn":"Shao Lin san shi liu fang","r":7.4,"rc":325,"img":"http://img31.mtime.cn/mt/2014/02/22/235545.88433835_1280X720X2.jpg","dN":"刘家良","aN1":"刘家辉","aN2":"王羽","p":["动作","剧情"],"cC":1,"sC":1,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":false,"commonSpecial":"","wantedCount":41,"movieType":"动作 | 剧情","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":26424,"t":"三少爷的剑","tCn":"三少爷的剑","tEn":"Death Deul","r":7,"rc":121,"img":"http://img31.mtime.cn/mt/2014/02/23/015159.72161905_1280X720X2.jpg","dN":"楚原","aN1":"尔冬升","aN2":"凌云","p":["动作","剧情"],"rd":"19770707","d":"91分钟","cC":1,"sC":2,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":false,"commonSpecial":"","wantedCount":48,"movieType":"动作 | 剧情","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":121183,"t":"精英部队：大敌当前","tCn":"精英部队：大敌当前","tEn":"Tropa de Elite 2","r":8.2,"rc":2404,"img":"http://img21.mtime.cn/mt/2011/11/08/170806.34577452_1280X720X2.jpg","dN":"何塞·帕迪里亚","aN1":"瓦格纳·马拉","aN2":"安德烈·拉米罗","p":["动作","犯罪","剧情","惊悚"],"rd":"20111125","d":"115分钟","cC":1,"sC":3,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"","wantedCount":798,"movieType":"动作 | 犯罪 | 剧情","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":94133,"t":"挪威的森林","tCn":"挪威的森林","tEn":"Norwegian Wood","r":7,"rc":3331,"img":"http://img21.mtime.cn/mt/2011/07/29/182511.98124922_1280X720X2.jpg","dN":"陈英雄","aN1":"松山健一","aN2":"菊地凛子","p":["剧情","爱情"],"rd":"20110916","cC":1,"sC":1,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":false,"commonSpecial":"","wantedCount":3202,"movieType":"剧情 | 爱情","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":153131,"t":"光棍终结者","tCn":"光棍终结者","tEn":"Single Terminator","r":5.2,"rc":316,"img":"http://img21.mtime.cn/mt/2011/11/07/182843.43638572_1280X720X2.jpg","dN":"赵非","aN1":"李艾","aN2":"周韦彤","p":["爱情","喜剧"],"rd":"20111111","cC":1,"sC":1,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1440806400,"ua":0,"isNew":false,"isHot":false,"isTicket":false,"commonSpecial":"","wantedCount":53,"movieType":"爱情 | 喜剧","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":20315,"t":"独臂刀","tCn":"独臂刀","tEn":"One-Armed Swordsman","r":7.5,"rc":283,"img":"http://img31.mtime.cn/mt/2014/01/07/170544.33379558_1280X720X2.jpg","dN":"张彻","aN1":"王羽","aN2":"焦姣","p":["动作","剧情","古装","武侠"],"rd":"19670726","cC":1,"sC":1,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1440892800,"ua":0,"isNew":false,"isHot":false,"isTicket":false,"commonSpecial":"","wantedCount":104,"movieType":"动作 | 剧情 | 古装","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":23261,"t":"刺马","tCn":"刺马","tEn":"Blood Brothers","r":7.6,"rc":220,"img":"http://img31.mtime.cn/mt/2013/06/09/162606.31541888_1280X720X2.jpg","dN":"张彻","aN1":"狄龙","aN2":"姜大卫","p":["动作","剧情"],"rd":"19730224","d":"118分钟","cC":1,"sC":1,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1440892800,"ua":0,"isNew":false,"isHot":false,"isTicket":false,"commonSpecial":"","wantedCount":101,"movieType":"动作 | 剧情","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":138836,"t":"华丽上班族","tCn":"华丽上班族","tEn":"Office","r":-1,"rc":91,"img":"http://img31.mtime.cn/mt/2015/08/21/085459.59797184_1280X720X2.jpg","dN":"杜琪峰","aN1":"周润发","aN2":"张艾嘉","p":["剧情","歌舞"],"rd":"20150902","d":"123分钟","cC":31,"sC":166,"rsC":0,"NearestCinemaCount":9,"NearestShowtimeCount":9,"NearestDay":1441065600,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"","wantedCount":2135,"movieType":"剧情 | 歌舞","is3D":true,"isIMAX":false,"isIMAX3D":false,"isDMAX":true,"versions":[{"enum":2,"version":"3D"},{"enum":6,"version":"中国巨幕"}]},{"id":226957,"t":"男神时代","tCn":"男神时代","tEn":"The Old Cinderella 2","r":-1,"rc":41,"img":"http://img31.mtime.cn/mt/2015/08/19/091504.28722492_1280X720X2.jpg","dN":"徐正超","aN1":"任言恺","aN2":"李菲儿","p":["爱情","剧情"],"rd":"20150902","cC":1,"sC":3,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":3,"NearestDay":1441152000,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"","wantedCount":136,"movieType":"爱情 | 剧情","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":217724,"t":"情敌蜜月","tCn":"情敌蜜月","tEn":"Honey Enemy","r":-1,"rc":79,"img":"http://img31.mtime.cn/mt/2015/08/28/090432.70638578_1280X720X2.jpg","dN":"张林子","aN1":"张雨绮","aN2":"权相佑","p":["爱情","剧情"],"rd":"20150902","cC":2,"sC":2,"rsC":0,"NearestCinemaCount":2,"NearestShowtimeCount":2,"NearestDay":1441152000,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"","wantedCount":348,"movieType":"爱情 | 剧情","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":218740,"t":"枕边诡影","tCn":"枕边诡影","tEn":"Atrange Bedfellows","r":-1,"rc":16,"img":"http://img31.mtime.cn/mt/2015/08/19/152449.26792454_1280X720X2.jpg","dN":"郑来志","aN1":"来喜","aN2":"王雅捷","p":["惊悚","爱情"],"rd":"20150903","cC":1,"sC":1,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1441238400,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"","wantedCount":244,"movieType":"惊悚 | 爱情","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":204453,"t":"亚马逊萌猴奇遇记","tCn":"亚马逊萌猴奇遇记","tEn":"Amazonia","r":-1,"rc":18,"img":"http://img31.mtime.cn/mt/2015/08/25/090613.24715035_1280X720X2.jpg","dN":"蒂埃里·拉格贝尔","aN1":"","aN2":"","p":["冒险","家庭"],"rd":"20150904","d":"85分钟","cC":1,"sC":1,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1441324800,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"","wantedCount":557,"movieType":"冒险 | 家庭","is3D":true,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[{"enum":2,"version":"3D"}]},{"id":222113,"t":"开罗宣言","tCn":"开罗宣言","tEn":"Cairo Declaration","r":-1,"rc":155,"img":"http://img31.mtime.cn/mt/2015/08/28/090845.41268959_1280X720X2.jpg","dN":"胡明刚","aN1":"胡军","aN2":"韩雪","p":["剧情","历史"],"rd":"20150903","d":"98分钟","cC":1,"sC":1,"rsC":0,"NearestCinemaCount":1,"NearestShowtimeCount":1,"NearestDay":1441584000,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"","wantedCount":87,"movieType":"剧情 | 历史","is3D":false,"isIMAX":false,"isIMAX3D":false,"isDMAX":false,"versions":[]},{"id":165359,"t":"碟中谍5：神秘国度","tCn":"碟中谍5：神秘国度","tEn":"Mission: Impossible - Rogue Nation","r":8.1,"rc":729,"img":"http://img31.mtime.cn/mt/2015/08/26/172348.25155416_1280X720X2.jpg","dN":"克里斯托夫·迈考利","aN1":"汤姆·克鲁斯","aN2":"丽贝卡·弗格森","p":["动作","冒险","惊悚"],"rd":"20150908","d":"131分钟","cC":4,"sC":74,"rsC":0,"NearestCinemaCount":3,"NearestShowtimeCount":3,"NearestDay":1441584000,"ua":0,"isNew":false,"isHot":false,"isTicket":true,"commonSpecial":"","wantedCount":6770,"movieType":"动作 | 冒险 | 惊悚","is3D":false,"isIMAX":true,"isIMAX3D":false,"isDMAX":true,"versions":[{"enum":3,"version":"IMAX"},{"enum":6,"version":"中国巨幕"}]}]
     * voucherMsg :
     */

    private int lid;
    private String bImg;
    private String date;
    private int totalComingMovie;
    private int newActivitiesTime;
    private String voucherMsg;
    private List<MsEntity> ms;

    public void setLid(int lid) {
        this.lid = lid;
    }

    public void setBImg(String bImg) {
        this.bImg = bImg;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTotalComingMovie(int totalComingMovie) {
        this.totalComingMovie = totalComingMovie;
    }

    public void setNewActivitiesTime(int newActivitiesTime) {
        this.newActivitiesTime = newActivitiesTime;
    }

    public void setVoucherMsg(String voucherMsg) {
        this.voucherMsg = voucherMsg;
    }

    public void setMs(List<MsEntity> ms) {
        this.ms = ms;
    }

    public int getLid() {
        return lid;
    }

    public String getBImg() {
        return bImg;
    }

    public String getDate() {
        return date;
    }

    public int getTotalComingMovie() {
        return totalComingMovie;
    }

    public int getNewActivitiesTime() {
        return newActivitiesTime;
    }

    public String getVoucherMsg() {
        return voucherMsg;
    }

    public List<MsEntity> getMs() {
        return ms;
    }

    public static class MsEntity implements Serializable {
        /**
         * id : 106560
         * t : 终结者：创世纪
         * tCn : 终结者：创世纪
         * tEn : Terminator Genisys
         * r : 7.4
         * rc : 4319
         * img : http://img31.mtime.cn/mt/2015/08/26/094552.75912154_1280X720X2.jpg
         * dN : 艾伦·泰勒
         * aN1 : 阿诺·施瓦辛格
         * aN2 : 艾米莉亚·克拉克
         * p : ["动作","冒险","科幻","惊悚"]
         * rd : 20150823
         * d : 126分钟
         * cC : 128
         * sC : 2487
         * rsC : 0
         * NearestCinemaCount : 128
         * NearestShowtimeCount : 1367
         * NearestDay : 1440806400
         * ua : 0
         * isNew : false
         * isHot : true
         * isTicket : true
         * commonSpecial : 各种挥泪致敬经典
         * wantedCount : 7324
         * movieType : 动作 | 冒险 | 科幻
         * is3D : true
         * isIMAX : false
         * isIMAX3D : true
         * isDMAX : true
         * versions : [{"enum":2,"version":"3D"},{"enum":4,"version":"IMAX3D"},{"enum":6,"version":"中国巨幕"}]
         */

        private int id;
        private String t;
        private String tCn;
        private String tEn;
        private double r;
        private int rc;
        private String img;
        private String dN;
        private String aN1;
        private String aN2;
        private String rd;
        private String d;
        private int cC;
        private int sC;
        private int rsC;
        private int NearestCinemaCount;
        private int NearestShowtimeCount;
        private int NearestDay;
        private int ua;
        private boolean isNew;
        private boolean isHot;
        private boolean isTicket;
        private String commonSpecial;
        private int wantedCount;
        private String movieType;
        private boolean is3D;
        private boolean isIMAX;
        private boolean isIMAX3D;
        private boolean isDMAX;
        private List<String> p;
        private List<VersionsEntity> versions;

        public void setId(int id) {
            this.id = id;
        }

        public void setT(String t) {
            this.t = t;
        }

        public void setTCn(String tCn) {
            this.tCn = tCn;
        }

        public void setTEn(String tEn) {
            this.tEn = tEn;
        }

        public void setR(double r) {
            this.r = r;
        }

        public void setRc(int rc) {
            this.rc = rc;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public void setDN(String dN) {
            this.dN = dN;
        }

        public void setAN1(String aN1) {
            this.aN1 = aN1;
        }

        public void setAN2(String aN2) {
            this.aN2 = aN2;
        }

        public void setRd(String rd) {
            this.rd = rd;
        }

        public void setD(String d) {
            this.d = d;
        }

        public void setCC(int cC) {
            this.cC = cC;
        }

        public void setSC(int sC) {
            this.sC = sC;
        }

        public void setRsC(int rsC) {
            this.rsC = rsC;
        }

        public void setNearestCinemaCount(int NearestCinemaCount) {
            this.NearestCinemaCount = NearestCinemaCount;
        }

        public void setNearestShowtimeCount(int NearestShowtimeCount) {
            this.NearestShowtimeCount = NearestShowtimeCount;
        }

        public void setNearestDay(int NearestDay) {
            this.NearestDay = NearestDay;
        }

        public void setUa(int ua) {
            this.ua = ua;
        }

        public void setIsNew(boolean isNew) {
            this.isNew = isNew;
        }

        public void setIsHot(boolean isHot) {
            this.isHot = isHot;
        }

        public void setIsTicket(boolean isTicket) {
            this.isTicket = isTicket;
        }

        public void setCommonSpecial(String commonSpecial) {
            this.commonSpecial = commonSpecial;
        }

        public void setWantedCount(int wantedCount) {
            this.wantedCount = wantedCount;
        }

        public void setMovieType(String movieType) {
            this.movieType = movieType;
        }

        public void setIs3D(boolean is3D) {
            this.is3D = is3D;
        }

        public void setIsIMAX(boolean isIMAX) {
            this.isIMAX = isIMAX;
        }

        public void setIsIMAX3D(boolean isIMAX3D) {
            this.isIMAX3D = isIMAX3D;
        }

        public void setIsDMAX(boolean isDMAX) {
            this.isDMAX = isDMAX;
        }

        public void setP(List<String> p) {
            this.p = p;
        }

        public void setVersions(List<VersionsEntity> versions) {
            this.versions = versions;
        }

        public int getId() {
            return id;
        }

        public String getT() {
            return t;
        }

        public String getTCn() {
            return tCn;
        }

        public String getTEn() {
            return tEn;
        }

        public double getR() {
            return r;
        }

        public int getRc() {
            return rc;
        }

        public String getImg() {
            return img;
        }

        public String getDN() {
            return dN;
        }

        public String getAN1() {
            return aN1;
        }

        public String getAN2() {
            return aN2;
        }

        public String getRd() {
            return rd;
        }

        public String getD() {
            return d;
        }

        public int getCC() {
            return cC;
        }

        public int getSC() {
            return sC;
        }

        public int getRsC() {
            return rsC;
        }

        public int getNearestCinemaCount() {
            return NearestCinemaCount;
        }

        public int getNearestShowtimeCount() {
            return NearestShowtimeCount;
        }

        public int getNearestDay() {
            return NearestDay;
        }

        public int getUa() {
            return ua;
        }

        public boolean getIsNew() {
            return isNew;
        }

        public boolean getIsHot() {
            return isHot;
        }

        public boolean getIsTicket() {
            return isTicket;
        }

        public String getCommonSpecial() {
            return commonSpecial;
        }

        public int getWantedCount() {
            return wantedCount;
        }

        public String getMovieType() {
            return movieType;
        }

        public boolean getIs3D() {
            return is3D;
        }

        public boolean getIsIMAX() {
            return isIMAX;
        }

        public boolean getIsIMAX3D() {
            return isIMAX3D;
        }

        public boolean getIsDMAX() {
            return isDMAX;
        }

        public List<String> getP() {
            return p;
        }

        public List<VersionsEntity> getVersions() {
            return versions;
        }

        public static class VersionsEntity {
            /**
             * enum : 2
             * version : 3D
             */

            @SerializedName("enum")
            private int enumX;
            private String version;

            public void setEnumX(int enumX) {
                this.enumX = enumX;
            }

            public void setVersion(String version) {
                this.version = version;
            }

            public int getEnumX() {
                return enumX;
            }

            public String getVersion() {
                return version;
            }
        }
    }
}
