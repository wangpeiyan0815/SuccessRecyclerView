package com.wpy.successrecyclerview.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by dell on 2017/3/5.
 */

public class Bean {


    private int login_status;
    private int total_number;
    private boolean has_more;
    private String post_content_hint;
    private int show_et_status;
    private int feed_flag;
    private String message;
    private boolean has_more_to_refresh;
    private TipsBeanHeadline tips;
    private List<DataBeanHeadline> data;

    public int getLogin_status() {
        return login_status;
    }

    public void setLogin_status(int login_status) {
        this.login_status = login_status;
    }

    public int getTotal_number() {
        return total_number;
    }

    public void setTotal_number(int total_number) {
        this.total_number = total_number;
    }

    public boolean isHas_more() {
        return has_more;
    }

    public void setHas_more(boolean has_more) {
        this.has_more = has_more;
    }

    public String getPost_content_hint() {
        return post_content_hint;
    }

    public void setPost_content_hint(String post_content_hint) {
        this.post_content_hint = post_content_hint;
    }

    public int getShow_et_status() {
        return show_et_status;
    }

    public void setShow_et_status(int show_et_status) {
        this.show_et_status = show_et_status;
    }

    public int getFeed_flag() {
        return feed_flag;
    }

    public void setFeed_flag(int feed_flag) {
        this.feed_flag = feed_flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isHas_more_to_refresh() {
        return has_more_to_refresh;
    }

    public void setHas_more_to_refresh(boolean has_more_to_refresh) {
        this.has_more_to_refresh = has_more_to_refresh;
    }

    public TipsBeanHeadline getTips() {
        return tips;
    }

    public void setTips(TipsBeanHeadline tips) {
        this.tips = tips;
    }

    public List<DataBeanHeadline> getData() {
        return data;
    }

    public void setData(List<DataBeanHeadline> data) {
        this.data = data;
    }

    public static class TipsBeanHeadline {


        private String display_info;
        private String open_url;
        private String web_url;
        private String app_name;
        private String package_name;
        private String display_template;
        private String type;
        private int display_duration;
        private String download_url;

        public String getDisplay_info() {
            return display_info;
        }

        public void setDisplay_info(String display_info) {
            this.display_info = display_info;
        }

        public String getOpen_url() {
            return open_url;
        }

        public void setOpen_url(String open_url) {
            this.open_url = open_url;
        }

        public String getWeb_url() {
            return web_url;
        }

        public void setWeb_url(String web_url) {
            this.web_url = web_url;
        }

        public String getApp_name() {
            return app_name;
        }

        public void setApp_name(String app_name) {
            this.app_name = app_name;
        }

        public String getPackage_name() {
            return package_name;
        }

        public void setPackage_name(String package_name) {
            this.package_name = package_name;
        }

        public String getDisplay_template() {
            return display_template;
        }

        public void setDisplay_template(String display_template) {
            this.display_template = display_template;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getDisplay_duration() {
            return display_duration;
        }

        public void setDisplay_duration(int display_duration) {
            this.display_duration = display_duration;
        }

        public String getDownload_url() {
            return download_url;
        }

        public void setDownload_url(String download_url) {
            this.download_url = download_url;
        }
    }

    public static class DataBeanHeadline {
        /**
         * read_count : 70248
         * media_name : 新华网
         * ban_comment : 0
         * abstract : 新华社北京3月5日电 第十二届全国人民代表大会第五次会议5日上午在人民大会堂开幕。国务院总理李克强向大会作政府工作报告时指出，使命重在担当，实干铸就辉煌。
         * image_list : []
         * has_video : false
         * article_type : 0
         * tag : news_politics
         * has_m3u8_video : 0
         * keywords : 张德江,李克强,习近平,主席团,主席台
         * rid : 20170305130516172017097003272F97
         * label : 置顶
         * show_portrait_article : false
         * user_verified : 0
         * aggr_type : 1
         * cell_type : 0
         * article_sub_type : 0
         * bury_count : 0
         * title : 十二届全国人大五次会议在京开幕
         * ignore_web_transform : 1
         * source_icon_style : 2
         * tip : 0
         * hot : 0
         * share_url : http://toutiao.com/group/6393850304899055873/?iid=3839760160&app=news_article
         * has_mp4_video : 0
         * source : 新华网
         * comment_count : 11
         * article_url : http://news.xinhuanet.com/politics/2017lh/2017-03/05/c_1120571131.htm
         * filter_words : []
         * publish_time : 1488685499
         * action_list : [{"action":1,"extra":{},"desc":""},{"action":3,"extra":{},"desc":""},{"action":7,"extra":{},"desc":""},{"action":9,"extra":{},"desc":""}]
         * has_image : false
         * cell_layout_style : 1
         * tag_id : 6393850304899055873
         * video_style : 0
         * verified_content :
         * display_url : http://toutiao.com/group/6393850304899055873/
         * is_stick : true
         * large_image_list : []
         * item_id : 6393856276656292354
         * is_subject : false
         * show_portrait : false
         * repin_count : 518
         * cell_flag : 11
         * user_info : {"verified_content":"","avatar_url":"http://p3.pstatp.com/thumb/3658/7378365093","user_id":4377795668,"name":"新华网","follower_count":0,"follow":false,"user_auth_info":"","user_verified":false,"description":""}
         * source_open_url : sslocal://profile?uid=4377795668
         * level : 0
         * like_count : 1
         * digg_count : 1
         * behot_time : 1488690316
         * cursor : 1488690316999
         * url : http://news.xinhuanet.com/politics/2017lh/2017-03/05/c_1120571131.htm
         * preload_web : 1
         * user_repin : 0
         * label_style : 6
         * item_version : 0
         * media_info : {"user_id":4377795668,"verified_content":"","avatar_url":"http://p2.pstatp.com/large/3658/7378365093","media_id":4377795668,"name":"新华网","recommend_type":0,"follow":false,"recommend_reason":"","is_star_user":false,"user_verified":false}
         * group_id : 6393850304899055873
         * middle_image : {}
         * video_duration : 0
         * log_extra : {"ad_price":"WLucjP_q0t9Yu5yM_-rS3wx5TdYsG1jjBXnY4A","convert_id":0,"req_id":"20170305130516172017097003272F97","rit":1}
         * display_info : 这个周末骑着ofo遛弯去！因为不收费了！！！
         * expire_seconds : 0
         * ad_id : 57134093599
         * natant_level : 2
         * article_alt_url : http://toutiao.com/group/article/6393848449942421762/
         * ad_label : 广告
         * stick_style : 0
         * create_time : 1488636776
         * comments : []
         * follow : 0
         * tiny_toutiao_url : http://p4.pstatp.com/origin/96b001b5529179077de
         * max_text_line : 10
         * content :
         * schema : sslocal://thread_detail?fid=6564242300&tid=1560948795614209&gd_ext_json={"category_id":"headline","enter_from":"click_headline","group_type":"forum_post","refer":"1"}
         * ui_type : 1
         * user : {"is_blocking":0,"user_id":56396567396,"screen_name":"健身的厨男","is_friend":0,"verified_content":"健身饮食达人","schema":"sslocal://profile?uid=56396567396&refer=dongtai","avatar_url":"http://tva4.sinaimg.cn/crop.0.8.495.495.50/e73c7777jw8f7y3alp5s7j20dr0e83zg.jpg","is_following":0,"user_auth_info":"{\"auth_type\": \"0\", \"auth_info\": \"健身饮食达人\"}","is_blocked":0,"user_verified":1,"desc":""}
         * user_digg : 0
         * friend_digg_list : []
         * forum : {"onlookers_count":38879,"banner_url":"","forum_name":"","concern_id":6286225228934679042,"forum_id":6564242300,"like_time":0,"talk_count":428342,"schema":"sslocal://concern?cid=6286225228934679042"}
         * thread_id : 1560948795614209
         * inner_ui_flag : 0
         * position : {"position":""}
         * image_count : 0
         * thumb_image_list : [{"url":"http://p7.pstatp.com/list/300x300/189f000079516ebb9500","url_list":[{"url":"http://p7.pstatp.com/list/300x300/189f000079516ebb9500"},{"url":"http://p4.pstatp.com/list/300x300/189f000079516ebb9500"},{"url":"http://p.pstatp.com/list/300x300/189f000079516ebb9500"}],"uri":"189f000079516ebb9500","height":605,"width":440,"type":1},{"url":"http://p7.pstatp.com/list/300x300/18a000004cb9a1771cd0","url_list":[{"url":"http://p7.pstatp.com/list/300x300/18a000004cb9a1771cd0"},{"url":"http://p4.pstatp.com/list/300x300/18a000004cb9a1771cd0"},{"url":"http://p.pstatp.com/list/300x300/18a000004cb9a1771cd0"}],"uri":"18a000004cb9a1771cd0","height":641,"width":440,"type":1},{"url":"http://p7.pstatp.com/list/300x300/189c00004be3a49f8b51","url_list":[{"url":"http://p7.pstatp.com/list/300x300/189c00004be3a49f8b51"},{"url":"http://p4.pstatp.com/list/300x300/189c00004be3a49f8b51"},{"url":"http://p.pstatp.com/list/300x300/189c00004be3a49f8b51"}],"uri":"189c00004be3a49f8b51","height":692,"width":440,"type":1},{"url":"http://p7.pstatp.com/list/300x300/16f3000600366ebb749f","url_list":[{"url":"http://p7.pstatp.com/list/300x300/16f3000600366ebb749f"},{"url":"http://p4.pstatp.com/list/300x300/16f3000600366ebb749f"},{"url":"http://p.pstatp.com/list/300x300/16f3000600366ebb749f"}],"uri":"16f3000600366ebb749f","height":458,"width":440,"type":1},{"url":"http://p2.pstatp.com/list/300x300/16f300060037f17a535c","url_list":[{"url":"http://p2.pstatp.com/list/300x300/16f300060037f17a535c"},{"url":"http://p4.pstatp.com/list/300x300/16f300060037f17a535c"},{"url":"http://p.pstatp.com/list/300x300/16f300060037f17a535c"}],"uri":"16f300060037f17a535c","height":712,"width":440,"type":1},{"url":"http://p3.pstatp.com/list/300x300/18a000004cba350d572f","url_list":[{"url":"http://p3.pstatp.com/list/300x300/18a000004cba350d572f"},{"url":"http://p6.pstatp.com/list/300x300/18a000004cba350d572f"},{"url":"http://p.pstatp.com/list/300x300/18a000004cba350d572f"}],"uri":"18a000004cba350d572f","height":528,"width":440,"type":1},{"url":"http://p3.pstatp.com/list/300x300/16f300060038dca1e6d1","url_list":[{"url":"http://p3.pstatp.com/list/300x300/16f300060038dca1e6d1"},{"url":"http://p6.pstatp.com/list/300x300/16f300060038dca1e6d1"},{"url":"http://p.pstatp.com/list/300x300/16f300060038dca1e6d1"}],"uri":"16f300060038dca1e6d1","height":712,"width":440,"type":1},{"url":"http://p2.pstatp.com/list/300x300/189f000079528b19da63","url_list":[{"url":"http://p2.pstatp.com/list/300x300/189f000079528b19da63"},{"url":"http://p4.pstatp.com/list/300x300/189f000079528b19da63"},{"url":"http://p.pstatp.com/list/300x300/189f000079528b19da63"}],"uri":"189f000079528b19da63","height":659,"width":440,"type":1},{"url":"http://p7.pstatp.com/list/300x300/16f200020296fec83a9d","url_list":[{"url":"http://p7.pstatp.com/list/300x300/16f200020296fec83a9d"},{"url":"http://p4.pstatp.com/list/300x300/16f200020296fec83a9d"},{"url":"http://p.pstatp.com/list/300x300/16f200020296fec83a9d"}],"uri":"16f200020296fec83a9d","height":568,"width":440,"type":1}]
         * gallary_image_count : 4
         * video_id : af2c99f8bfd642a38b7cee9ed5b52d63
         * video_detail_info : {"show_pgc_subscribe":1,"video_preloading_flag":0,"video_third_monitor_url":"","group_flags":32832,"direct_play":1,"detail_video_large_image":{"url":"http://p1.pstatp.com/video1609/17670009e31aedc57cc8","width":580,"url_list":[{"url":"http://p1.pstatp.com/video1609/17670009e31aedc57cc8"},{"url":"http://p4.pstatp.com/video1609/17670009e31aedc57cc8"},{"url":"http://p.pstatp.com/video1609/17670009e31aedc57cc8"}],"uri":"video1609/17670009e31aedc57cc8","height":326},"video_id":"af2c99f8bfd642a38b7cee9ed5b52d63","video_watch_count":595971,"video_type":0,"video_watching_count":0}
         * group_flags : 32833
         * more_mode : true
         * city : 深圳
         */

        private int read_count;
        private String media_name;
        private int ban_comment;
        @SerializedName("abstract")
        private String abstractX;
        private boolean has_video;
        private int article_type;
        private String tag;
        private int has_m3u8_video;
        private String keywords;
        private String rid;
        private String label;
        private boolean show_portrait_article;
        private int user_verified;
        private int aggr_type;
        private int cell_type;
        private int article_sub_type;
        private int bury_count;
        private String title;
        private int ignore_web_transform;
        private int source_icon_style;
        private int tip;
        private int hot;
        private String share_url;
        private int has_mp4_video;
        private String source;
        private int comment_count;
        private String article_url;
        private int publish_time;
        private boolean has_image;
        private int cell_layout_style;
        private long tag_id;
        private int video_style;
        private String verified_content;
        private String display_url;
        private boolean is_stick;
        private long item_id;
        private boolean is_subject;
        private boolean show_portrait;
        private int repin_count;
        private int cell_flag;
        private UserInfoBeanHeadline user_info;
        private String source_open_url;
        private int level;
        private int like_count;
        private int digg_count;
        private int behot_time;
        private long cursor;
        private String url;
        private int preload_web;
        private int user_repin;
        private int label_style;
        private int item_version;
        private MediaInfoBeanHeadline media_info;
        private long group_id;
        private MiddleImageBeanHeadline middle_image;
        private int video_duration;
        private String log_extra;
        private String display_info;
        private int expire_seconds;
        private long ad_id;
        private int natant_level;
        private String article_alt_url;
        private String ad_label;
        private int stick_style;
        private int create_time;
        private int follow;
        private String tiny_toutiao_url;
        private int max_text_line;
        private String content;
        private String schema;
        private int ui_type;
        private UserBeanHeadline user;
        private int user_digg;
        private ForumBeanHeadline forum;
        private long thread_id;
        private int inner_ui_flag;
        private PositionBeanHeadline position;
        private int image_count;
        private int gallary_image_count;
        private String video_id;
        private VideoDetailInfoBeanHeadline video_detail_info;
        private int group_flags;
        private boolean more_mode;
        private String city;
        private List<?> image_list;
        private List<?> filter_words;
        private List<ActionListBeanHeadline> action_list;
        private List<?> large_image_list;
        private List<?> comments;
        private List<?> friend_digg_list;
        private List<ThumbImageListBeanHeadline> thumb_image_list;

        public int getRead_count() {
            return read_count;
        }

        public void setRead_count(int read_count) {
            this.read_count = read_count;
        }

        public String getMedia_name() {
            return media_name;
        }

        public void setMedia_name(String media_name) {
            this.media_name = media_name;
        }

        public int getBan_comment() {
            return ban_comment;
        }

        public void setBan_comment(int ban_comment) {
            this.ban_comment = ban_comment;
        }

        public String getAbstractX() {
            return abstractX;
        }

        public void setAbstractX(String abstractX) {
            this.abstractX = abstractX;
        }

        public boolean isHas_video() {
            return has_video;
        }

        public void setHas_video(boolean has_video) {
            this.has_video = has_video;
        }

        public int getArticle_type() {
            return article_type;
        }

        public void setArticle_type(int article_type) {
            this.article_type = article_type;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public int getHas_m3u8_video() {
            return has_m3u8_video;
        }

        public void setHas_m3u8_video(int has_m3u8_video) {
            this.has_m3u8_video = has_m3u8_video;
        }

        public String getKeywords() {
            return keywords;
        }

        public void setKeywords(String keywords) {
            this.keywords = keywords;
        }

        public String getRid() {
            return rid;
        }

        public void setRid(String rid) {
            this.rid = rid;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public boolean isShow_portrait_article() {
            return show_portrait_article;
        }

        public void setShow_portrait_article(boolean show_portrait_article) {
            this.show_portrait_article = show_portrait_article;
        }

        public int getUser_verified() {
            return user_verified;
        }

        public void setUser_verified(int user_verified) {
            this.user_verified = user_verified;
        }

        public int getAggr_type() {
            return aggr_type;
        }

        public void setAggr_type(int aggr_type) {
            this.aggr_type = aggr_type;
        }

        public int getCell_type() {
            return cell_type;
        }

        public void setCell_type(int cell_type) {
            this.cell_type = cell_type;
        }

        public int getArticle_sub_type() {
            return article_sub_type;
        }

        public void setArticle_sub_type(int article_sub_type) {
            this.article_sub_type = article_sub_type;
        }

        public int getBury_count() {
            return bury_count;
        }

        public void setBury_count(int bury_count) {
            this.bury_count = bury_count;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getIgnore_web_transform() {
            return ignore_web_transform;
        }

        public void setIgnore_web_transform(int ignore_web_transform) {
            this.ignore_web_transform = ignore_web_transform;
        }

        public int getSource_icon_style() {
            return source_icon_style;
        }

        public void setSource_icon_style(int source_icon_style) {
            this.source_icon_style = source_icon_style;
        }

        public int getTip() {
            return tip;
        }

        public void setTip(int tip) {
            this.tip = tip;
        }

        public int getHot() {
            return hot;
        }

        public void setHot(int hot) {
            this.hot = hot;
        }

        public String getShare_url() {
            return share_url;
        }

        public void setShare_url(String share_url) {
            this.share_url = share_url;
        }

        public int getHas_mp4_video() {
            return has_mp4_video;
        }

        public void setHas_mp4_video(int has_mp4_video) {
            this.has_mp4_video = has_mp4_video;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public int getComment_count() {
            return comment_count;
        }

        public void setComment_count(int comment_count) {
            this.comment_count = comment_count;
        }

        public String getArticle_url() {
            return article_url;
        }

        public void setArticle_url(String article_url) {
            this.article_url = article_url;
        }

        public int getPublish_time() {
            return publish_time;
        }

        public void setPublish_time(int publish_time) {
            this.publish_time = publish_time;
        }

        public boolean isHas_image() {
            return has_image;
        }

        public void setHas_image(boolean has_image) {
            this.has_image = has_image;
        }

        public int getCell_layout_style() {
            return cell_layout_style;
        }

        public void setCell_layout_style(int cell_layout_style) {
            this.cell_layout_style = cell_layout_style;
        }

        public long getTag_id() {
            return tag_id;
        }

        public void setTag_id(long tag_id) {
            this.tag_id = tag_id;
        }

        public int getVideo_style() {
            return video_style;
        }

        public void setVideo_style(int video_style) {
            this.video_style = video_style;
        }

        public String getVerified_content() {
            return verified_content;
        }

        public void setVerified_content(String verified_content) {
            this.verified_content = verified_content;
        }

        public String getDisplay_url() {
            return display_url;
        }

        public void setDisplay_url(String display_url) {
            this.display_url = display_url;
        }

        public boolean isIs_stick() {
            return is_stick;
        }

        public void setIs_stick(boolean is_stick) {
            this.is_stick = is_stick;
        }

        public long getItem_id() {
            return item_id;
        }

        public void setItem_id(long item_id) {
            this.item_id = item_id;
        }

        public boolean isIs_subject() {
            return is_subject;
        }

        public void setIs_subject(boolean is_subject) {
            this.is_subject = is_subject;
        }

        public boolean isShow_portrait() {
            return show_portrait;
        }

        public void setShow_portrait(boolean show_portrait) {
            this.show_portrait = show_portrait;
        }

        public int getRepin_count() {
            return repin_count;
        }

        public void setRepin_count(int repin_count) {
            this.repin_count = repin_count;
        }

        public int getCell_flag() {
            return cell_flag;
        }

        public void setCell_flag(int cell_flag) {
            this.cell_flag = cell_flag;
        }

        public UserInfoBeanHeadline getUser_info() {
            return user_info;
        }

        public void setUser_info(UserInfoBeanHeadline user_info) {
            this.user_info = user_info;
        }

        public String getSource_open_url() {
            return source_open_url;
        }

        public void setSource_open_url(String source_open_url) {
            this.source_open_url = source_open_url;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public int getLike_count() {
            return like_count;
        }

        public void setLike_count(int like_count) {
            this.like_count = like_count;
        }

        public int getDigg_count() {
            return digg_count;
        }

        public void setDigg_count(int digg_count) {
            this.digg_count = digg_count;
        }

        public int getBehot_time() {
            return behot_time;
        }

        public void setBehot_time(int behot_time) {
            this.behot_time = behot_time;
        }

        public long getCursor() {
            return cursor;
        }

        public void setCursor(long cursor) {
            this.cursor = cursor;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getPreload_web() {
            return preload_web;
        }

        public void setPreload_web(int preload_web) {
            this.preload_web = preload_web;
        }

        public int getUser_repin() {
            return user_repin;
        }

        public void setUser_repin(int user_repin) {
            this.user_repin = user_repin;
        }

        public int getLabel_style() {
            return label_style;
        }

        public void setLabel_style(int label_style) {
            this.label_style = label_style;
        }

        public int getItem_version() {
            return item_version;
        }

        public void setItem_version(int item_version) {
            this.item_version = item_version;
        }

        public MediaInfoBeanHeadline getMedia_info() {
            return media_info;
        }

        public void setMedia_info(MediaInfoBeanHeadline media_info) {
            this.media_info = media_info;
        }

        public long getGroup_id() {
            return group_id;
        }

        public void setGroup_id(long group_id) {
            this.group_id = group_id;
        }

        public MiddleImageBeanHeadline getMiddle_image() {
            return middle_image;
        }

        public void setMiddle_image(MiddleImageBeanHeadline middle_image) {
            this.middle_image = middle_image;
        }

        public int getVideo_duration() {
            return video_duration;
        }

        public void setVideo_duration(int video_duration) {
            this.video_duration = video_duration;
        }

        public String getLog_extra() {
            return log_extra;
        }

        public void setLog_extra(String log_extra) {
            this.log_extra = log_extra;
        }

        public String getDisplay_info() {
            return display_info;
        }

        public void setDisplay_info(String display_info) {
            this.display_info = display_info;
        }

        public int getExpire_seconds() {
            return expire_seconds;
        }

        public void setExpire_seconds(int expire_seconds) {
            this.expire_seconds = expire_seconds;
        }

        public long getAd_id() {
            return ad_id;
        }

        public void setAd_id(long ad_id) {
            this.ad_id = ad_id;
        }

        public int getNatant_level() {
            return natant_level;
        }

        public void setNatant_level(int natant_level) {
            this.natant_level = natant_level;
        }

        public String getArticle_alt_url() {
            return article_alt_url;
        }

        public void setArticle_alt_url(String article_alt_url) {
            this.article_alt_url = article_alt_url;
        }

        public String getAd_label() {
            return ad_label;
        }

        public void setAd_label(String ad_label) {
            this.ad_label = ad_label;
        }

        public int getStick_style() {
            return stick_style;
        }

        public void setStick_style(int stick_style) {
            this.stick_style = stick_style;
        }

        public int getCreate_time() {
            return create_time;
        }

        public void setCreate_time(int create_time) {
            this.create_time = create_time;
        }

        public int getFollow() {
            return follow;
        }

        public void setFollow(int follow) {
            this.follow = follow;
        }

        public String getTiny_toutiao_url() {
            return tiny_toutiao_url;
        }

        public void setTiny_toutiao_url(String tiny_toutiao_url) {
            this.tiny_toutiao_url = tiny_toutiao_url;
        }

        public int getMax_text_line() {
            return max_text_line;
        }

        public void setMax_text_line(int max_text_line) {
            this.max_text_line = max_text_line;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getSchema() {
            return schema;
        }

        public void setSchema(String schema) {
            this.schema = schema;
        }

        public int getUi_type() {
            return ui_type;
        }

        public void setUi_type(int ui_type) {
            this.ui_type = ui_type;
        }

        public UserBeanHeadline getUser() {
            return user;
        }

        public void setUser(UserBeanHeadline user) {
            this.user = user;
        }

        public int getUser_digg() {
            return user_digg;
        }

        public void setUser_digg(int user_digg) {
            this.user_digg = user_digg;
        }

        public ForumBeanHeadline getForum() {
            return forum;
        }

        public void setForum(ForumBeanHeadline forum) {
            this.forum = forum;
        }

        public long getThread_id() {
            return thread_id;
        }

        public void setThread_id(long thread_id) {
            this.thread_id = thread_id;
        }

        public int getInner_ui_flag() {
            return inner_ui_flag;
        }

        public void setInner_ui_flag(int inner_ui_flag) {
            this.inner_ui_flag = inner_ui_flag;
        }

        public PositionBeanHeadline getPosition() {
            return position;
        }

        public void setPosition(PositionBeanHeadline position) {
            this.position = position;
        }

        public int getImage_count() {
            return image_count;
        }

        public void setImage_count(int image_count) {
            this.image_count = image_count;
        }

        public int getGallary_image_count() {
            return gallary_image_count;
        }

        public void setGallary_image_count(int gallary_image_count) {
            this.gallary_image_count = gallary_image_count;
        }

        public String getVideo_id() {
            return video_id;
        }

        public void setVideo_id(String video_id) {
            this.video_id = video_id;
        }

        public VideoDetailInfoBeanHeadline getVideo_detail_info() {
            return video_detail_info;
        }

        public void setVideo_detail_info(VideoDetailInfoBeanHeadline video_detail_info) {
            this.video_detail_info = video_detail_info;
        }

        public int getGroup_flags() {
            return group_flags;
        }

        public void setGroup_flags(int group_flags) {
            this.group_flags = group_flags;
        }

        public boolean isMore_mode() {
            return more_mode;
        }

        public void setMore_mode(boolean more_mode) {
            this.more_mode = more_mode;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public List<?> getImage_list() {
            return image_list;
        }

        public void setImage_list(List<?> image_list) {
            this.image_list = image_list;
        }

        public List<?> getFilter_words() {
            return filter_words;
        }

        public void setFilter_words(List<?> filter_words) {
            this.filter_words = filter_words;
        }

        public List<ActionListBeanHeadline> getAction_list() {
            return action_list;
        }

        public void setAction_list(List<ActionListBeanHeadline> action_list) {
            this.action_list = action_list;
        }

        public List<?> getLarge_image_list() {
            return large_image_list;
        }

        public void setLarge_image_list(List<?> large_image_list) {
            this.large_image_list = large_image_list;
        }

        public List<?> getComments() {
            return comments;
        }

        public void setComments(List<?> comments) {
            this.comments = comments;
        }

        public List<?> getFriend_digg_list() {
            return friend_digg_list;
        }

        public void setFriend_digg_list(List<?> friend_digg_list) {
            this.friend_digg_list = friend_digg_list;
        }

        public List<ThumbImageListBeanHeadline> getThumb_image_list() {
            return thumb_image_list;
        }

        public void setThumb_image_list(List<ThumbImageListBeanHeadline> thumb_image_list) {
            this.thumb_image_list = thumb_image_list;
        }

        public static class UserInfoBeanHeadline {
            /**
             * verified_content :
             * avatar_url : http://p3.pstatp.com/thumb/3658/7378365093
             * user_id : 4377795668
             * name : 新华网
             * follower_count : 0
             * follow : false
             * user_auth_info :
             * user_verified : false
             * description :
             */

            private String verified_content;
            private String avatar_url;
            private long user_id;
            private String name;
            private int follower_count;
            private boolean follow;
            private String user_auth_info;
            private boolean user_verified;
            private String description;

            public String getVerified_content() {
                return verified_content;
            }

            public void setVerified_content(String verified_content) {
                this.verified_content = verified_content;
            }

            public String getAvatar_url() {
                return avatar_url;
            }

            public void setAvatar_url(String avatar_url) {
                this.avatar_url = avatar_url;
            }

            public long getUser_id() {
                return user_id;
            }

            public void setUser_id(long user_id) {
                this.user_id = user_id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getFollower_count() {
                return follower_count;
            }

            public void setFollower_count(int follower_count) {
                this.follower_count = follower_count;
            }

            public boolean isFollow() {
                return follow;
            }

            public void setFollow(boolean follow) {
                this.follow = follow;
            }

            public String getUser_auth_info() {
                return user_auth_info;
            }

            public void setUser_auth_info(String user_auth_info) {
                this.user_auth_info = user_auth_info;
            }

            public boolean isUser_verified() {
                return user_verified;
            }

            public void setUser_verified(boolean user_verified) {
                this.user_verified = user_verified;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }
        }

        public static class MediaInfoBeanHeadline {
        }

        public static class MiddleImageBeanHeadline {
        }

        public static class UserBeanHeadline {
            /**
             * is_blocking : 0
             * user_id : 56396567396
             * screen_name : 健身的厨男
             * is_friend : 0
             * verified_content : 健身饮食达人
             * schema : sslocal://profile?uid=56396567396&refer=dongtai
             * avatar_url : http://tva4.sinaimg.cn/crop.0.8.495.495.50/e73c7777jw8f7y3alp5s7j20dr0e83zg.jpg
             * is_following : 0
             * user_auth_info : {"auth_type": "0", "auth_info": "健身饮食达人"}
             * is_blocked : 0
             * user_verified : 1
             * desc :
             */

            private int is_blocking;
            private long user_id;
            private String screen_name;
            private int is_friend;
            private String verified_content;
            private String schema;
            private String avatar_url;
            private int is_following;
            private String user_auth_info;
            private int is_blocked;
            private int user_verified;
            private String desc;

            public int getIs_blocking() {
                return is_blocking;
            }

            public void setIs_blocking(int is_blocking) {
                this.is_blocking = is_blocking;
            }

            public long getUser_id() {
                return user_id;
            }

            public void setUser_id(long user_id) {
                this.user_id = user_id;
            }

            public String getScreen_name() {
                return screen_name;
            }

            public void setScreen_name(String screen_name) {
                this.screen_name = screen_name;
            }

            public int getIs_friend() {
                return is_friend;
            }

            public void setIs_friend(int is_friend) {
                this.is_friend = is_friend;
            }

            public String getVerified_content() {
                return verified_content;
            }

            public void setVerified_content(String verified_content) {
                this.verified_content = verified_content;
            }

            public String getSchema() {
                return schema;
            }

            public void setSchema(String schema) {
                this.schema = schema;
            }

            public String getAvatar_url() {
                return avatar_url;
            }

            public void setAvatar_url(String avatar_url) {
                this.avatar_url = avatar_url;
            }

            public int getIs_following() {
                return is_following;
            }

            public void setIs_following(int is_following) {
                this.is_following = is_following;
            }

            public String getUser_auth_info() {
                return user_auth_info;
            }

            public void setUser_auth_info(String user_auth_info) {
                this.user_auth_info = user_auth_info;
            }

            public int getIs_blocked() {
                return is_blocked;
            }

            public void setIs_blocked(int is_blocked) {
                this.is_blocked = is_blocked;
            }

            public int getUser_verified() {
                return user_verified;
            }

            public void setUser_verified(int user_verified) {
                this.user_verified = user_verified;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }
        }

        public static class ForumBeanHeadline {
            /**
             * onlookers_count : 38879
             * banner_url :
             * forum_name :
             * concern_id : 6286225228934679042
             * forum_id : 6564242300
             * like_time : 0
             * talk_count : 428342
             * schema : sslocal://concern?cid=6286225228934679042
             */

            private int onlookers_count;
            private String banner_url;
            private String forum_name;
            private long concern_id;
            private long forum_id;
            private int like_time;
            private int talk_count;
            private String schema;

            public int getOnlookers_count() {
                return onlookers_count;
            }

            public void setOnlookers_count(int onlookers_count) {
                this.onlookers_count = onlookers_count;
            }

            public String getBanner_url() {
                return banner_url;
            }

            public void setBanner_url(String banner_url) {
                this.banner_url = banner_url;
            }

            public String getForum_name() {
                return forum_name;
            }

            public void setForum_name(String forum_name) {
                this.forum_name = forum_name;
            }

            public long getConcern_id() {
                return concern_id;
            }

            public void setConcern_id(long concern_id) {
                this.concern_id = concern_id;
            }

            public long getForum_id() {
                return forum_id;
            }

            public void setForum_id(long forum_id) {
                this.forum_id = forum_id;
            }

            public int getLike_time() {
                return like_time;
            }

            public void setLike_time(int like_time) {
                this.like_time = like_time;
            }

            public int getTalk_count() {
                return talk_count;
            }

            public void setTalk_count(int talk_count) {
                this.talk_count = talk_count;
            }

            public String getSchema() {
                return schema;
            }

            public void setSchema(String schema) {
                this.schema = schema;
            }
        }

        public static class PositionBeanHeadline {
            /**
             * position :
             */

            private String position;

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }
        }

        public static class VideoDetailInfoBeanHeadline {
            /**
             * show_pgc_subscribe : 1
             * video_preloading_flag : 0
             * video_third_monitor_url :
             * group_flags : 32832
             * direct_play : 1
             * detail_video_large_image : {"url":"http://p1.pstatp.com/video1609/17670009e31aedc57cc8","width":580,"url_list":[{"url":"http://p1.pstatp.com/video1609/17670009e31aedc57cc8"},{"url":"http://p4.pstatp.com/video1609/17670009e31aedc57cc8"},{"url":"http://p.pstatp.com/video1609/17670009e31aedc57cc8"}],"uri":"video1609/17670009e31aedc57cc8","height":326}
             * video_id : af2c99f8bfd642a38b7cee9ed5b52d63
             * video_watch_count : 595971
             * video_type : 0
             * video_watching_count : 0
             */

            private int show_pgc_subscribe;
            private int video_preloading_flag;
            private String video_third_monitor_url;
            private int group_flags;
            private int direct_play;
            private DetailVideoLargeImageBeanHeadline detail_video_large_image;
            private String video_id;
            private int video_watch_count;
            private int video_type;
            private int video_watching_count;

            public int getShow_pgc_subscribe() {
                return show_pgc_subscribe;
            }

            public void setShow_pgc_subscribe(int show_pgc_subscribe) {
                this.show_pgc_subscribe = show_pgc_subscribe;
            }

            public int getVideo_preloading_flag() {
                return video_preloading_flag;
            }

            public void setVideo_preloading_flag(int video_preloading_flag) {
                this.video_preloading_flag = video_preloading_flag;
            }

            public String getVideo_third_monitor_url() {
                return video_third_monitor_url;
            }

            public void setVideo_third_monitor_url(String video_third_monitor_url) {
                this.video_third_monitor_url = video_third_monitor_url;
            }

            public int getGroup_flags() {
                return group_flags;
            }

            public void setGroup_flags(int group_flags) {
                this.group_flags = group_flags;
            }

            public int getDirect_play() {
                return direct_play;
            }

            public void setDirect_play(int direct_play) {
                this.direct_play = direct_play;
            }

            public DetailVideoLargeImageBeanHeadline getDetail_video_large_image() {
                return detail_video_large_image;
            }

            public void setDetail_video_large_image(DetailVideoLargeImageBeanHeadline detail_video_large_image) {
                this.detail_video_large_image = detail_video_large_image;
            }

            public String getVideo_id() {
                return video_id;
            }

            public void setVideo_id(String video_id) {
                this.video_id = video_id;
            }

            public int getVideo_watch_count() {
                return video_watch_count;
            }

            public void setVideo_watch_count(int video_watch_count) {
                this.video_watch_count = video_watch_count;
            }

            public int getVideo_type() {
                return video_type;
            }

            public void setVideo_type(int video_type) {
                this.video_type = video_type;
            }

            public int getVideo_watching_count() {
                return video_watching_count;
            }

            public void setVideo_watching_count(int video_watching_count) {
                this.video_watching_count = video_watching_count;
            }

            public static class DetailVideoLargeImageBeanHeadline {
                /**
                 * url : http://p1.pstatp.com/video1609/17670009e31aedc57cc8
                 * width : 580
                 * url_list : [{"url":"http://p1.pstatp.com/video1609/17670009e31aedc57cc8"},{"url":"http://p4.pstatp.com/video1609/17670009e31aedc57cc8"},{"url":"http://p.pstatp.com/video1609/17670009e31aedc57cc8"}]
                 * uri : video1609/17670009e31aedc57cc8
                 * height : 326
                 */

                private String url;
                private int width;
                private String uri;
                private int height;
                private List<UrlListBeanHeadline> url_list;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public List<UrlListBeanHeadline> getUrl_list() {
                    return url_list;
                }

                public void setUrl_list(List<UrlListBeanHeadline> url_list) {
                    this.url_list = url_list;
                }

                public static class UrlListBeanHeadline {
                    /**
                     * url : http://p1.pstatp.com/video1609/17670009e31aedc57cc8
                     */

                    private String url;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }
                }
            }
        }

        public static class ActionListBeanHeadline {
            /**
             * action : 1
             * extra : {}
             * desc :
             */

            private int action;
            private ExtraBeanHeadline extra;
            private String desc;

            public int getAction() {
                return action;
            }

            public void setAction(int action) {
                this.action = action;
            }

            public ExtraBeanHeadline getExtra() {
                return extra;
            }

            public void setExtra(ExtraBeanHeadline extra) {
                this.extra = extra;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public static class ExtraBeanHeadline {
            }
        }

        public static class ThumbImageListBeanHeadline {
            /**
             * url : http://p7.pstatp.com/list/300x300/189f000079516ebb9500
             * url_list : [{"url":"http://p7.pstatp.com/list/300x300/189f000079516ebb9500"},{"url":"http://p4.pstatp.com/list/300x300/189f000079516ebb9500"},{"url":"http://p.pstatp.com/list/300x300/189f000079516ebb9500"}]
             * uri : 189f000079516ebb9500
             * height : 605
             * width : 440
             * type : 1
             */

            private String url;
            private String uri;
            private int height;
            private int width;
            private int type;
            private List<UrlListBeanHeadlineX> url_list;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public List<UrlListBeanHeadlineX> getUrl_list() {
                return url_list;
            }

            public void setUrl_list(List<UrlListBeanHeadlineX> url_list) {
                this.url_list = url_list;
            }

            public static class UrlListBeanHeadlineX {
                /**
                 * url : http://p7.pstatp.com/list/300x300/189f000079516ebb9500
                 */

                private String url;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }
    }
}
