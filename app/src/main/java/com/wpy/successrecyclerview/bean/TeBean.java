package com.wpy.successrecyclerview.bean;

/**
 * Created by dell on 2017/3/5.
 */

public class TeBean {
    /*#Android中各种奇葩,难解的Json
    * Json文件中的字段是java的关键字
    * 示例json

    ```bash
    {
        "abstract": "Success",
            "error_code": 0,
            "new": "haha"
    }
    ```
            * 解析bean写法--使用google提供的序列化工具，这样写，就可以正常的将数据反射到字段中了
    *

            ```bash
    public class FourthData {
        @SerializedName("abstract")
        private String abstracts;
        private String error_code;
        @SerializedName("new")
        public String isNew;
    }
    ```

            * json文件中包含map集合类型的数据
    * 示例json

    ```bash
    {
        "error_code": 0,
            "reason": "Success",
            "result": {
        "data": [
        {
            "1": "精彩猜谜",
                "10": "校园稚语",
                "11": "名言警句",
                "12": "祈福话语",
                "13": "童语无忌",
                "14": "人生格言",
                "15": "夫妻对语",
                "16": "幽默段子",
                "17": "轻松幽默",
                "18": "问候大全",
                "19": "搞笑段子",
                "2": "歇后语大全",
                "20": "名人名言",
                "21": "绕口令",
                "22": "情话大全",
                "23": "回味段子",
                "24": "饮食男女",
                "25": "歉意合集",
                "26": "轻笑话接口",
                "27": "古惑仔大全",
                "28": "人与动物",
                "29": "幽默英语",
                "3": "打油诗大全",
                "30": "惊悚大全",
                "31": "简捷笑话",
                "32": "厕所段子",
                "33": "神跟帖",
                "4": "脑筋急转弯",
                "5": "笑话大全",
                "6": "创意短语",
                "7": "笑口常开",
                "8": "囧人糗事",
                "9": "冷场段子"
        }
        ]
    }
    }
    ```
            * 解析Bean写法

    ```bash
    public class FirstData {
        public String error_code;
        public String reason;
        public Result result;
        public class Result {
            //由于json中数据  data下的泛型是Map<Integer,String>类型，所以这样写
            public List<Map<Integer, String>> data;
        }
    }
    ```
            * json文件中包含map集合类型的数据示例二 同上
    * 示例json

    ```bash
    {
        "reason": "Return Successd!",
            "result": {
        "data": [
        {
            "ADDRESS": "江苏省苏州市吴中区金鸡湖大道368号",
                "LAT": "31.29854",
                "LNG": "120.721423",
                "MCC": "460",
                "MNC": "1",
                "O_LAT": "31.296529947917",
                "O_LNG": "120.72577772352",
                "PRECISION": "1101"
        }
        ]
    },
        "resultcode": "200"
    }
    ```
            * Bean的写法，和上边示例实类似的，不过泛型改成String

    ```bash
    public class SecondData {
        public String reason;
        public String resultcode;
        public MyResult result;
        public class MyResult {
            public List<HashMap<String, String>> data;
        }
    }
    ```
            * Json文件中包含map集合类型数据示例三
    * 示例json

    ```bash
    {
        "star": {
        "data": {
            "1": {
                "link": "http://people.mtime.com/2100136/",
                        "name": "尼尔·塞西"
            },
            "2": {
                "link": "http://people.mtime.com/898690/",
                        "name": "比尔·默瑞"
            },
            "3": {
                "link": "http://people.mtime.com/924106/",
                        "name": "本·金斯利"
            },
            "4": {
                "link": "http://people.mtime.com/962842/",
                        "name": "伊德瑞斯·艾尔巴"
            },
            "m_1": {
                "link": "http://m.mtime.cn/#!/person/2100136/"
            },
            "m_2": {
                "link": "http://m.mtime.cn/#!/person/898690/"
            },
            "m_3": {
                "link": "http://m.mtime.cn/#!/person/924106/"
            },
            "m_4": {
                "link": "http://m.mtime.cn/#!/person/962842/"
            }
        },
        "showname": "主演"
    }
    }
    ```
            * Bean写法，这一个不同于前两个
    *
            ```bash
    public class ThirdData {
        public Star star;
        public class Star{
            public String showname;
            //这里map的泛型，key是String，值是普通对象类型，需要自己定义Bean
            public HashMap<String,Actor> data;
        }
        public class Actor{
            public String link;
            public String name;
        }
    }*/
}
