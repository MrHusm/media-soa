package com.yxsd.kanshu.constant;

import java.util.regex.Pattern;

public class Constans {
	//升级掊口相关start
	public static final String EMOBLIE_PRODUCT_CACHE_KEY = "EMOBLIE_PRODUCT_CACHE_KEY_"; //
	public static final String EMOBLIE_CHANNEL_CACHE_KEY = "EMOBLIE_CHANNEL_CACHE_KEY_";
	public static final String EMOBLIE_VERSION_CACHE_KEY = "EMOBLIE_VERSION_CACHE_KEY_";
	public static final int CACHE_EXPIRE_TIME = 2*60*60;
	//升级掊口相关 end
	
	
	//收藏类型
	public static final String STORE_UP_MEDIA="media";
	public static final String STORE_UP_DISCOVER="discover";
	public static final String STORE_UP_DIGEST = "digest";
	
	//栏目内容为纸书
	public static final int COLUMN_MEDIA_TYPE_PAPER_BOOK =3;
	
	//栏目内容为电子书
	public static final int COLUMN_MEDIA_TYPE_EBOOK =2;
	
	//栏目内容里的电子书和纸书
	public static final int COLUMN_MEDIA_TYPE_E_PAPER_BOOK =0;
	
	/**
	 * 上传CDN图片前缀
	 */
	public static final String PATH_PREFIX = "kanshu";
	/**
	 * DDClick redis queue key
	 */
	public static final String HAPI_DDCLICK_SAVE_QUEUE = "hapi_ddclick_save_queue";
	
	/**
	 * DDClick ddreader redis queue key
	 */
	public static final String HAPI_DDCLICK_DDREADER_SAVE_QUEUE = "hapi_ddclick_ddreader_save_queue";
	
	/**
	 * DDClick Digest redis queue key(翻篇儿ddclick消息队列)
	 */
	public static final String HAPI_DDCLICK_DIGEST_SAVE_QUEUE = "hapi_ddclick_digest_save_queue";
	
	/**
	 * 读书活动奖励 rabbit mq key
	 */
	public static final String MEDIA_DDREADER_READACTIVITY_REWARDS_QUEUE = "media_ddreader_readactivity_rewards_queue";
	
	/**
	 * 翻篇儿ddclick collection name
	 */
	public static final String DDCLICK_DIGEST_COLLECTION_NAME = "digest_click";
	
	/*活动标识    奖品类型:1,抽奖，2膜拜，3分享，4红包，5每日送福袋，6撒金币*/
	public static final int MEDIA_ACTIVITY_PRIZE_TYPE = 1;
	public static final int MEDIA_ACTIVITY_WORSHIP_TYPE = 2;
	public static final int MEDIA_ACTIVITY_SHARE_TYPE = 3;
	public static final int MEDIA_ACTIVITY_REDPACKET_TYPE = 4;
	public static final int MEDIA_ACTIVITY_PUSHLOTS_TYPE = 5;
	public static final int MEDIA_ACTIVITY_GETCONS_TYPE = 6;
	
	public static final int CACHE_EXPIRE_TIME_OF_USERIMG =24 * 60 * 60;
	
	//敏感词缓存
	public static final String ILL_WORD_CACHE_KEY="ill_word_";
	
	public static final int CACHE_EXPIRE_TIME_ILL_WORD = 2 * 60 * 60;
	//榜缓存
	public static final String MEDIA_LIST_RANKING_SALE_CACHE_KEY ="media_list_ranking_";
	//活动中奖/参与名单
	public static final String MEDIA_ACTIVITY_RECORDS_CACHE_KEY ="media_activity_records_cache_";
	public static final int MEDIA_ACTIVITY_RECORDS_AMOUNT_CACHE_KEY =100;
	public static final int CACHE_EXPIRE_TIME_OF_ACTIVITY_RECORDS = 10 * 60 * 60;
	//块缓存
	public static final String MEDIA_BLOCK_CACHE_KEY ="media_block_cache_";
	public static final int CACHE_EXPIRE_TIME_OF_BLOCK =24 * 60 * 60;
	//奖品缓存
	public static final String MEDIA_PRIZE_VEST_TYPE_KEY = "media_prize_vest_type_";
	public static final int CACHE_EXPIRE_TIME_OF_PRIZE = 24 * 60 * 60;
	//用户活动基本信息
	public static final String MEDIA_ACTIVITY_USER_KEY = "media_activity_user_";
	public static final int CACHE_EXPIRE_TIME_OF_ACT_USER_KEY = 24 * 60 * 60;
	//用户活动参与信息
	public static final String MEDIA_USER_ACTIVITYS_KEY = "media_user_activitys_";
	public static final int CACHE_EXPIRE_TIME_OF_USER_ACTIVITYS = 12 * 60 * 60;
	public static final int MEDIA_USER_ACTIVITYS_AMOUNT =500;
	//壕赏榜缓存
	public static final String MEDIA_RANK_CONS_BOOK_KEY = "media_rank_cons_book_";
	public static final int CACHE_EXPIRE_TIME_OF_RANK_CONS_BOOK = 24 * 60 * 60;
	public static final int MEDIA_RANK_CONS_BOOK_AMOUNT =100;
	public static final int MEDIA_RANK_CONS_ONE_BOOK_AMOUNT =20;
	public static final String MEDIA_RANK_CONS_BOOK_TOTAL_KEY = "media_rank_cons_book_total";
	//单品打赏列表缓存
	public static final String MEDIA_REWARDED_USER_CACHE_KEY = "media_rewarded_user_cache_";
	public static final int CACHE_EXPIRE_TIME_OF_REWARDED_USER =2 * 60 * 60;
	public static final int MEDIA_REWARDED_USER_AMOUNT = 10;
	//用户打赏书的saleid  key
	public static final String MEDIA_REWARD_SALE_IDS_CACHE_KEY ="media_reward_sale_ids_cache_";
	public static final int CACHE_EXPIRE_TIME_OF_REWARD_SALE_IDS =5 * 60 * 60;
	public static final int MEDIA_REWARD_SALE_IDS_ACOUNT = 10;
	public static final String MEDIA_ACTIVITY_TODAY_USER_LIMIT_FLAG = "1";
	//分享限制
	public static final String MEDIA_SHARE_LIMIT_CACHE_KEY = "media_share_limt_cache";
	//膜拜限制
	public static final String MEDIA_WORSHIP_LIMIT_CACHE_KEY = "media_worship_limt_cache";
	//活动用户该日缓存 
	public static final String MEDIA_ACTIVITY_TODAY_USER_CACHE_KEY = "media_act_today_user_";
	//红包剩余次数
	public static final String MEDIA_RED_PACKET_CUSTID_COINS_CACHE_KEY = "media_red_custid_coins_";
	public static final int CACHE_EXPIRE_TIME_OF_MEDIA_RED_PACKET_CUSTID_COINS =2 * 60 * 60;
	public static final String MEDIA_RED_PACKET_LEFTS_CACHE_KEY = "media_red_packet_lefts";
	public static final String MEDIA_RED_PACKET_SHARE_LIMIT_CACHE_KEY = "media_red_packet_share_limit";
	public static final String MEDIA_RED_PACKET_DAY_LIMIT_CACHE_KEY = "media_red_packet_day_limit";
	//每日领福袋限制
	public static final String MEDIA_PUSHLOTS_LIMIT_CACHE_KEY = "media_pushlots_limt_cache";
	//撒金币
	public static final String MEDIA_SPREAD_COINS_LIMIT_CACHE_KEY = "media_spread_coins_day_limit";
	
	//榜缓存每天从前500里随机取得100本
	public static final String MEDIA_LIST_RANKING_SALE_RANDOM_DAILY_CACHE_KEY ="media_list_ranking_sale_random_daily_cache_key_";
	
	public static final int CACHE_EXPIRE_TIME_OF_MEDIA_LIST_RANKING =2 * 60 * 60;
	
	//用户膜拜关系缓存key,key=CUST_WORSHIP_CACHE_KEY+custId+"_"+type(我膜拜和膜拜我的)
	public static final String CUST_WORSHIP_CACHE_KEY="cust_worship_cache_";
	
	public static final int CACHE_EXPIRE_TIME_OF_CUST_WORSHIP_CACHE =2 * 60 * 60;

	//用户活动基本信息
	public static final String MEDIA_MESSAGE_CACHE_KEY = "media_message_cache_";
	
	public static final String Channel_Article_Digest_CACHE_KEY = "channel_article_digest_cache_";
	
	public static final String Channel_Collection_CACHE_KEY = "channel_collection_cache_";
	/**
	 * 系统参数缓存设置 
	 */
	public static final String SYSTEM_PROPERTY_KEY ="system_property_";
	
	public static final int CACHE_EXPIRE_TIME_OF_SYSTEM_PROPERTY = 2 * 60 * 60;
	
	/**
	 * 栏目缓存设置 
	 */
	public static final String COLUMN_CACHE_KEY ="column_cache_";
	//栏目组
	public static final String COLUMN_GROUP_CACHE_KEY ="column_group_cache_";
	
	//栏目下mediaId列表缓存
	public static final String COLUMN_MEDIA_ID_LIST_CACHE_KEY ="column_media_id_list_cache_";

	//栏目下mediaId缓存
	public static final String COLUMN_MEDIA_ID_CACHE_KEY ="column_media_id_cache_";
	//栏目销毁时间.
	public static final int CACHE_EXPIRE_TIME_OF_COLUMN_MEDIA_ID = 5*60;
	
	public static final int CACHE_EXPIRE_TIME_OF_COLUMN_MEDIA_ID_LIST = 24*60*60;
	
	public static final int CACHE_EXPIRE_TIME_OF_COLUMN = 2 * 60 * 60;
	
	/**
	 * 栏目内容缓存设置 
	 */
	public static final String COLUMN_CONTENT_CACHE_KEY ="column_content_cache_";

	public static final int CACHE_EXPIRE_TIME_OF_COLUMN_CONTENT = 2 * 60 * 60;
	
	/**
	 * 当天用户栏目访问信息记录hash key
	 */
	public static final String USER_COLUMN_VISIT_KEY ="user_column_visit_key_";
	/**
	 * 频道缓存
	 */
	public static final String CHANNEL_CACHE_KEY ="channel_cache_";
	/**
	 * 栏目攻略文章缓存
	 */
	public static final String Digest_CACHE_KEY ="digest_cache_";
	
	/**
	 * 标签链接缓存
	 */
	public static final String TAGLINK_CACHE_KEY ="taglink_cache_";
	
	/**
	 * 首页置盯文章缓存
	 */
	public static final String DIGEST_TOP_CACHE_KEY="channel_digest_top_";
	
	public static final int CACHE_EXPIRE_TIME_OF_DIGEST_TOP =  2 * 60 * 60;
	/**
	 * 频道和书单默认背景图地址列表缓存key
	 */
	public static final String CHANNEL_BOOKLIST_BACKGROUD_IMG_CACHE_KEY="cb_backgroud_img_cache_";
	
	public static final int CACHE_EXPIRE_TIME_OF_CHANNEL_BOOKLIST_BACKGROUD =  2 * 60 * 60;
	
	public static final int CACHE_EXPIRE_TIME_OF_CHANNEL =  2 * 60 * 60;
	/**
	 * 公告分类 
	 */
	public static final String ANNOUNCEMENT_CATEGORY_CACHE_KEY ="announcement_category_cache_";
	
	public static final int CACHE_EXPIRE_TIME_OF_ANNOUNCEMENT_CATEGORY = 2 * 60 * 60;
	/**
	 * 公告分类 缓存设置 
	 */
	public static final String ANNOUNCEMENT_CONTENT_CACHE_KEY ="announcement_content_cache_";
	
	public static final int CACHE_EXPIRE_TIME_OF_ANNOUNCEMENT_CONTENT = 2 * 60 * 60;
	
	/**
	 * 榜单内容缓存
	 * 
	 */
	public static final String RANKING_LIST_CACHE_KEY ="ranking_list_cache_";
	
	public static final int CACHE_EXPIRE_TIME_OF_RANKING_LIST = 2 * 60 * 60;

	public static final int CACHE_EXPIRE_TIME_OF_FREEDEALPRICE = 30 * 60;
	
	/**
	 * 火辣限免缓存
	 * 
	 */
	public static final String HOT_FREE_CACHE_KEY ="hot_free_cache_";
	
	public static final int CACHE_EXPIRE_TIME_OF_HOT_FREE = 2 * 60 * 60;
	
	
	/**
	 * media分类统计数据缓存
	 * 
	 */
	
	
	public static final String MEDIA_CATEGORY_RELATION_KEY="media_category_relation_key_";
			
	public static final int CACHE_EXPIRE_TIME_OF_MEDIA_CATEGORY_RELATION= 2 * 60 * 60;
	
	public static final String MEDIA_CATEGORY_DATA_CACHE_KEY ="media_category_data_cache_";

	public static final String MEDIA_VIP_CATEGORY_DATA_CACHE_KEY ="media_vip_category_data_cache_";
	
	public static final int CACHE_EXPIRE_TIME_OF_MEDIA_CATEGORY_DATA = 2 * 60 * 60;
	
	
	/**
	 * 榜单缓存设置 
	 */
	public static final String LISTCATEGORY_CACHE_KEY ="listcategory_cache_";
	
	public static final int CACHE_EXPIRE_TIME_OF_LISTCATEGORY = 2 * 60 * 60;
	
	/**
	 * 分类节点树的key
	 */
	public static final String MEDIA_CATEGORY_TREE_CACHE_KEY ="media_category_tree_cache_";
	
	public static final int CACHE_EXPIRE_TIME_OF_MEDIA_CATEGORY_TREE = 2 * 60 * 60;
	
	/**
	 * media分类信息缓存
	 */
	public static final String MEDIA_CATEGORY_CACHE_KEY ="media_category_cache_";
	public static final int CACHE_EXPIRE_TIME_OF_MEDIA_CATEGORY = 2 * 60 * 60;

	/**
	 * 专题缓存
	 */
	public static final String SPECIAL_TOPIC_CACHE_KEY ="special_topic_cache_";
	public static final int CACHE_EXPIRE_TIME_OF_SPECIAL_TOPIC = 2 * 60 * 60;
	
	/**
	 * 首页专题编号列表
	 */
	public static final String HOME_PAGE_ST_LIST_CACHE_KEY ="home_page_st_list_cache_";
	public static final int CACHE_EXPIRE_TIME_OF_HOME_PAGE_ST_LIST = 2 * 60 * 60;

	/**
	 * 漫画章节图片列表
	 */
	public static final String MANHUA_CHAPTER_IMG_LIST_CACHE_KEY ="manhua_chapter_img_list_cache_";
	public static final int CACHE_EXPIRE_TIME_OF_MANHUA_CHAPTER_IMG_LIST = 2 * 60 * 60;
	
	/**
	 * 送货类型缓存
	 */
	public static final String SHIP_TYPE_CACHE_KEY ="ship_type_cache_";
	
	/**
	 * 纸质书单品缓存
	 */
	public static final String PAPER_MEDIA_CACHE_KEY ="paper_media_cache_";
	
	/**
	 * 纸质书单品排名缓存
	 */
	public static final String PAPER_MEDIA_RANK_CACHE_KEY ="paper_media_rank_cache_";
	
	/**
	 * 纸质书单品试读缓存
	 */
	public static final String PAPER_MEDIA_EXTRACT_CACHE_KEY ="paper_media_extract_cache_";
	
	/**
	 * 纸质书缓存30分钟
	 */
	public static final int CACHE_EXPIRE_TIME_OF_PAPER_MEDIA = 30;
	
	/**
	 * 电子书促销信息缓存
	 */
	public static final String MEDIA_PROMOTION_CACHE_KEY ="media_promotion_cache";
	/**
	 * media所有的价格信息缓存
	 */
	public static final String MEDIA_ALL_PRICES_CACHE_KEY ="media_all_prices_cache";

	public static final String MEDIA_ALL_PRICES_CACHE_KEY_NEW ="media_all_prices_cache_new_";

	/**
	 * top1读书计划
	 */
	public static final String MEDIA_TOP_READ_PLAN_KEY = "media_top_read_plan_";

	/**
	 * top3评论 不设置过期时间
	 */
	public static final String MEDIA_TOP_ARTICLE_KEY = "media_top_article_";

	/**
	 *top1书摘 不设置过期时间
	 */
	public static final String MEDIA_TOP_NOTE_KEY = "media_top_note_";

	/**
	 * 在读人数 不设置过期时间
	 */
	public static final String MEDIA_READ_NUMBER_KEY = "media_read_number_";

	public static final int CACHE_EXPIRE_TIME_OF_MEDIA_PROMOTION = 5 * 60;

	public static final int CACHE_EXPIRE_TIME_OF_MEDIA_PROMOTION_FLAG = 15 * 60;

	public static final String MASTER_LOGIN = "back_master";// 后台session

	public static final String XS_SESSIONID = "xs_sessionId"; // 图片验证码session
	/**
	 * 后台业务操作码：查看
	 */
	public static final String OPERATE_FLAG_SELECT = "0";
	/**
	 * 后台业务操作码：更新
	 */
	public static final String OPERATE_FLAG_UPDATE = "1";
	/**
	 * 后台业务操作码：添加
	 */
	public static final String OPERATE_FLAG_INSERT = "2";

	/**
	 * 购买标示：电子书
	 */
	public static final String BUY_FLAG_ORDER = "1";
	/**
	 * 购买标示：道具
	 */
	public static final String BUY_FLAG_PROP = "2";
	/**
	 * 购买标示：包月
	 */
	public static final String BUY_FLAG_MONTHLY = "3";
	/**
	 * 购买标示：打赏
	 */
	public static final String BUY_FLAG_REWARDS = "4";
	/**
	 * 购买标示：福袋
	 */
	public static final String BUY_FLAG_LUCKYBAG = "5";
	/**
	 * 购买标示：塞红包(转账)
	 */
	public static final String BUY_FLAG_BALANCETRANSFER = "6";
	/**
	 * 购买标示：打赏文章
	 */
	public static final String BUY_FLAG_REWARDS_DIGEST = "8";
	/**
	 * 购买标示：其他
	 */
	public static final String BUY_FLAG_OTHER = "0";

	/**
	 * 章节下载方式：html
	 */
	public static final String CHAPTER_DOWNLOAD_TYPE_HTML = "html";

	/**
	 * 章节下载方式：zip
	 */
	public static final String CHAPTER_DOWNLOAD_TYPE_ZIP = "zip";

	/**
	 * 是否免费：是
	 */
	public static final String IS_FREE_YES = "1";

	/**
	 * 是否免费：否
	 */
	public static final String IS_FREE_NO = "0";
	/**
	 * 全本订单
	 */
	public static final short ORDER_WHOLE_YES = 1;

	/**
	 * 章节订单
	 */
	public static final short ORDER_WHOLE_NOT = 0;
	/**
	 * 订单类型：电子书
	 */
	public static final int ORDER_TYPE_EBOOK = 1;

	/**
	 * 订单类型：视频
	 */
	public static final int ORDER_TYPE_VIDEO = 2;

	/**
	 * 订单类型：音频
	 */
	public static final int ORDER_TYPE_AUDIO = 3;

	/**
	 * 订单类型：其他
	 */
	public static final int ORDER_TYPE_OTHER = 4;

	/**
	 * 订单状态：新建
	 */
	public static final int ORDER_STATUS_NEW = 1;

	/**
	 * 订单状态：已支付
	 */
	public static final int ORDER_STATUS_PAID = 2;

	/**
	 * 订单状态：已取消
	 */
	public static final int ORDER_STATUS_CANCEL = 3;

	/**
	 * 交易类型: 充值
	 */
	public static final int TRADE_TYPE_RECHARGE = 1;
	/**
	 * 交易类型: 消费
	 */
	public static final int TRADE_TYPE_CONSUME = 2;
	/**
	 * 交易类型: 查询
	 */
	public static final int TRADE_TYPE_QUERY = 3;
	/**
	 * 消费支付方式: 主账户支付
	 */
	public static final String CONSUME_PAYMENT_MAIN = "1";
	/**
	 * 消费支付方式: 副账户支付
	 */
	public static final String CONSUME_PAYMENT_SUB = "2";
	/**
	 * 消费支付方式: 混合支付
	 */
	public static final String CONSUME_PAYMENT_MIXED = "3";

	/**
	 * 临时文件存储相对路径
	 */
	public static final String TEMP_FILE_PATH = "temp";

	/**** 系统配置 ****/

	/**
	 * 系统配置：电子书秘钥加密方式
	 */
	public static final String SYSTEM_CONFIG_MEDIA_ENCRYPT_TYPE = "media_encrypt_type";
	/**
	 * 权限绑定类型：章节绑定
	 */
	public static final int BINDING_AUTHORITY_TYPE_CHAPTER = 1;
	/**
	 * 权限绑定类型：整本绑定
	 */
	public static final int UNBINDING_AUTHORITY_TYPE_MEDIA = 3;
	/**
	 * 权限绑定类型：章节解绑
	 */
	public static final int UNBINDING_AUTHORITY_TYPE_CHAPTER = 4;
	/**
	 * 权限绑定类型：整本解绑
	 */
	public static final int BINDING_AUTHORITY_TYPE_MEDIA = 2;
	/**
	 * 创建订单异常回滚点：封装订单数据
	 */
	public static final int CREATE_ORDER_ROLLBACK_EOI = 1;
	/**
	 * 创建订单异常回滚点：预处理
	 */
	public static final int CREATE_ORDER_ROLLBACK_PFCO = 2;
	/**
	 * 创建订单异常回滚点：保存订单
	 */
	public static final int CREATE_ORDER_ROLLBACK_SOI = 3;
	/**
	 * 创建订单异常回滚点：后处理
	 */
	public static final int CREATE_ORDER_ROLLBACK_AFCO = 4;
	/**
	 * 创建订单异常回滚点：更新用户信息
	 */
	public static final int CREATE_ORDER_ROLLBACK_UUIFCO = 5;
	/**
	 * 创建消费记录异常回滚点：封装消费记录数据
	 */
	public static final int CREATE_CONSUME_ROLLBACK_EOI = 1;
	/**
	 * 创建消费记录异常回滚点：预处理
	 */
	public static final int CREATE_CONSUME_ROLLBACK_PFCO = 2;
	/**
	 * 创建消费记录异常回滚点：保存消费记录
	 */
	public static final int CREATE_CONSUME_ROLLBACK_SOI = 3;
	/**
	 * 创建消费记录异常回滚点：后处理
	 */
	public static final int CREATE_CONSUME_ROLLBACK_AFCO = 4;
	/**
	 * 创建消费记录异常回滚点：更新用户信息
	 */
	public static final int CREATE_CONSUME_ROLLBACK_UUIFCO = 5;
	/**
	 * 消费结算状态：已结算
	 */
	public static final short CONSUME_ISFINAL_ESTIMATE = 1;
	/**
	 * 消费结算状态：未结算
	 */
	public static final short CONSUME_NOTFINAL_ESTIMATE = 0;
	
	/**
	 * 买了又买、看了又看 用户历史数据最大参考条数
	 */
	public static final int BUYALSOBUY_VIEWALSOVIEW_MAXREFERED_HISTORY_NUMBER = 30;

	/**
	 * 买了又买推荐的最多条数
	 */
	public static final int BUYAGAIN_RECOMMEND_NUMBER = 100;

	/**
	 * 买了又买 统计天数
	 */
	public static final int BUYAGAIN_RECOMMEND_DAYS = 10;
	
	/**
	 * 看了又看 统计天数
	 */
	public static final int READ_ALSO_READ_RECOMMEND_DAYS = 10;
	
	/**
	 * 看了又看 推荐的最多条数
	 */
	public static final int READ_ALSO_READ_RECOMMEND_NUMBER = 100;
	/**
	 * 猜你喜欢 用户行为最多保存数量
	 */
	public static final int RECOMMEND_CUSTOMER_BEHAVIOR_MAX_NUMBER = 100;
	
	/**
	 * 猜你喜欢 最多推荐数量
	 */
	public static final int RECOMMEND_GUESSULIKE_MAX_NUMBER = 100;
	
	/**
	 * 所有原创category的path
	 */
	public static final String RECOMMEND_MEDIA_CATEGORYPATHS = "recommend_media_categorypaths_";
	
	/**
	 * 买了又买，看了又看，relation 的缓存 key前缀
	 */
	public static final String RECOMMEND_MEDIA_RELATION_KEY = "recommend_media_relation_key_";
	
	/**
	 * 买了又买，看了又看，mediaId 对应的其他书籍id的List<Long> 的缓存 key前缀
	 */
	public static final String RECOMMEND_MEDIA_RELATED_KEY = "buy_again_media_related_key_";

	/**
	 * 推荐系统用的 media 对应的基础销售实体信息 缓存key
	 */
	public static final String RECOMMEND_MEDIA_SALE_KEY = "recommend_media_sale_key_";
	
	/**
	 * 猜你喜欢，用户当天行为 的缓存 key前缀
	 */
	public static final String RECOMMEND_CUSTOMER_BEHAVIOUR_KEY = "recommend_customer_behaviour_key";
	
	/**
	 * 买了又买，看了又看，用户历史缓存 key前缀
	 */
	public static final String RECOMMEND_CUSTOMER_HISTORY_KEY = "recommend_customer_history_key_";
	
	/**
	 * 猜你喜欢，把DDClick数据传给跑看了又看信息线程的redis key
	 */
	public static final String RECOMMEND_CUSTOMER_VIEW_REDIS_FROM_BEHAVIOUR_KEY = "recommend_customer_view_redis_from_behaviour_key";
	
	/**
	 * 推荐系统跑出来的media对应的categories 前缀
	 */
	public static final String RECOMMEND_MEDIA_CATEGORIES_KEY = "recommend_media_categories_key_";
	
	/**
	 * 推荐系统跑出来的所有category对应的前200热销书缓存key
	 */
	public static final String RECOMMEND_CATEGORIES_BEST_SELLER_KEY = "recommend_categories_best_seller_key";
	
	/**
	 * 推荐系统跑出来的单个category对应的前200热销书缓存key前缀
	 */
	public static final String RECOMMEND_CATEGORIES_BEST_SELLER_SOLO_KEY = "recommend_categories_best_seller_solo_key_";
	
	/**
	 * CustomerMediaStatistic 用户某天对某个media的某关系的数据前缀
	 */
	public static final String RECOMMEND_MEDIA_STATISTIC_DAILY_KEY_PREFIX = "recommend_media_statistic_daily_key_prefix";
	
	/**
	 * 推荐系统抽象接口用的position
	 */
	public static final String RECOMMEND_POSITION_KEY = "recommend.position_";
	
	/**
	 * 用户推荐语电子书前缀
	 */
	public static final String CUSTOMER_RECOMMEND_WORDS_EBOOK = "customer_recommend_words_ebook_";
	
	/**
	 * 用户推荐语纸书前缀
	 */
	public static final String CUSTOMER_RECOMMEND_WORDS_PBOOK = "customer_recommend_words_pbook_";

	/**
	 * 每日分享的默认限制次数
	 */
	public static final int SHARE_DAY_LIMIT = 3;

	/**
	 * 每日膜拜的默认限制次数
	 */
	public static final int WORSHIP_DAY_LIMIT = 3;

	/**
	 * 默认缓存过期时间： 销售主体
	 */
	public static final int CACHE_EXPIRE_TIME_OF_MEDIA_SALE = 2 * 60 * 60;
	/**
	 * 默认缓存过期时间：media
	 */
	public static final int CACHE_EXPIRE_TIME_OF_MEDIA = 2 * 60 * 60;
	/**
	 * 默认缓存过期时间：章节
	 */
	public static final int CACHE_EXPIRE_TIME_OF_CHAPTER = 2 * 60 * 60;
	
	/**
	 * 默认缓存过期时间：作者
	 */
	public static final int CACHE_EXPIRE_TIME_OF_AUTHOR = 2 * 60 * 60;
	
	/**
	 * 默认缓存过期时间：用户阅读权限
	 */
	public static final int CACHE_EXPIRE_TIME_OF_AUTHORITY = 2 * 60 * 60;
	
	/**
	 * 默认缓存过期时间：目录
	 */
	public static final int CACHE_EXPIRE_TIME_OF_CONTENTS = 30 * 60;
	
	/**
	 * 默认缓存过期时间：用户包月信息
	 */
	public static final int CACHE_EXPIRE_TIME_OF_MONTHLY = 2 * 60 * 60;
	
	/**
	 * 默认缓存过期时间：活动
	 */
	public static final int CACHE_EXPIRE_TIME_OF_ACTIVITY = 2 * 60 * 60;

	/**
	 * 系统配置中过期时间的key：销售主体
	 */
	public static final String CACHE_EXPIRE_TIME_OF_MEDIA_SALE_KEY = "cache_expire_time_of_media_sale";
	/**
	 * 系统配置中过期时间的key：media
	 */
	public static final String CACHE_EXPIRE_TIME_OF_MEDIA_KEY = "cache_expire_time_of_media";
	/**
	 * 系统配置中过期时间的key：章节
	 */
	public static final String CACHE_EXPIRE_TIME_OF_CHAPTER_KEY = "cache_expire_time_of_chapter";
	
	/**
	 * 系统配置中过期时间的key：作者
	 */
	public static final String CACHE_EXPIRE_TIME_OF_AUTHOR_KEY = "cache_expire_time_of_author";
	
	/**
	 * 系统配置中过期时间的key：用户阅读权限
	 */
	public static final String CACHE_EXPIRE_TIME_OF_AUTHORITY_KEY = "cache_expire_time_of_authority";
	
	/**
	 * 系统配置中过期时间的key：目录
	 */
	public static final String CACHE_EXPIRE_TIME_OF_CONTENTS_KEY = "cache_expire_time_of_contents";
	
	/**
	 * 系统配置中过期时间的key：用户包月信息
	 */
	public static final String CACHE_EXPIRE_TIME_OF_MONTHLY_KEY = "cache_expire_time_of_monthly";
	/**
	 * 系统配置中过期时间的key：活动
	 */
	public static final String CACHE_EXPIRE_TIME_OF_ACTIVITY_KEY = "cache_expire_time_of_activity";

	/**
	 * 缓存key前缀：销售主体
	 */
	public static final String CACHE_KEY_PREFIX_MEDIA_SALE = "media_sale_";

	/**
	 * 缓存key前缀：销售主体集合
	 */
	public static final String CACHE_KEY_PREFIX_MEDIA_SALE_BATCH = "media_sale_batch_";

	/**
	 * 缓存key前缀：media全部信息
	 */
	public static final String CACHE_KEY_PREFIX_MEDIA_WHOLE = "media_whole_";
	/**
	 * 缓存key前缀：media基本信息
	 */
	public static final String CACHE_KEY_PREFIX_MEDIA_BASIC = "media_basic_";
	/**
	 * 缓存key前缀：章节全部信息
	 */
	public static final String CACHE_KEY_PREFIX_CHAPTER_WHOLE = "chapter_whole_";
	/**
	 * 缓存key前缀：章节基本信息
	 */
	public static final String CACHE_KEY_PREFIX_CHAPTER_BASIC = "chapter_basic_";
	/**
	 * 缓存key前缀：作者信息
	 */
	public static final String CACHE_KEY_PREFIX_AUTHOR = "author_";
	/**
	 * 缓存key前缀：目录
	 */
	public static final String CACHE_KEY_PREFIX_CONTENTS = "media_contents_";
	
	/**
	 * 缓存key前缀：用户阅读权限
	 */
	public static final String CACHE_KEY_PREFIX_AUTHORITY = "user_authority_";
	
	/**
	 * 缓存key前缀：用户阅读权限
	 */
	public static final String CACHE_KEY_PREFIX_MONTHLY = "user_monthly_";
	
	/**
	 * 缓存key前缀：活动信息
	 */
	public static final String CACHE_KEY_PREFIX_ACTIVITY_INFO = "activity_info_";
	/**
	 * 缓存key前缀：活动销售主体关系
	 */
	public static final String CACHE_KEY_PREFIX_ACTIVITY_SALE = "activity_sale_";

	public static Pattern commaSpliter = Pattern.compile(",");

	public static Pattern semiColonSpliter = Pattern.compile(";");

	public static Pattern underlineSpliter = Pattern.compile("_");

	public static String CREATE_ORDER_AUTO_DOWNLOAD = "1";

	public static String CREATE_ORDER_NOT_AUTO_DOWNLOAD = "0";

	/**
	 * 电子书证书加密key版本
	 */
	public static final String RESOURCE_ENCODE_VERSION = "resource.encode.type";

	/**
	 * 是否自动购买： 是
	 */
	public static final String AUTO_BUY_YES = "1";

	/**
	 * 是否自动购买：否
	 */
	public static final String AUTO_BUY_NO = "0";
	
	/**
	 * 用户阅读权限类型:全本
	 */
	public static final short USER_AUTHORITY_MEIDA = 1;
	
	/**
	 * 用户阅读权限类型:章节
	 */
	public static final short USER_AUTHORITY_CHAPTER = 2;
	
	/**
	 * 用户阅读权限类型:借阅
	 */
	public static final short USER_AUTHORITY_BORROW = 3;
	
	/**
	 * 用户阅读权限类型:包月
	 */
	public static final short USER_AUTHORITY_MONTHLY = 4;
	
	/**
	 * 包月类型：全场
	 */
	public static final short MONTHLY_PAYMENT_TYPE_ALL = 1001;
	/**
	 * 包月类型：栏目
	 */
	public static final short MONTHLY_PAYMENT_TYPE_COLUMN = 1002;
	/**
	 * 包月类型：分类
	 */
	public static final short MONTHLY_PAYMENT_TYPE_CATEGORY = 1003;
	/**
	 * 活动状态：有效
	 */
	public static final int ACTIVITYINFO_STATUS_VALID = 1;
	/**
	 * 活动状态：无效
	 */
	public static final int ACTIVITYINFO_STATUS_INVALID = 0;
	/**
	 * 充值支付状态：校验失败
	 */
	public static final short CONSUMER_DEPOSIT_ISPAID_CHECK_FAIL = 0;
	/**
	 * 充值支付状态：未校验
	 */
	public static final short CONSUMER_DEPOSIT_ISPAID_CHECK_NOT = 1;
	/**
	 * 充值支付状态：校验成功
	 */
	public static final short CONSUMER_DEPOSIT_ISPAID_CHECK_SUCCESS = 2;
	/**
	 * 充值支付状态：充值异常
	 */
	public static final short CONSUMER_DEPOSIT_ISPAID_DEPOSIT_EXCEPTION = 3;
	/**
	 * 充值支付状态：已作废
	 */
	public static final short CONSUMER_DEPOSIT_ISPAID_DEPOSIT_CANCEL = 4;
	/**
	 * 充值支付状态：回滚失败
	 */
	public static final short CONSUMER_DEPOSIT_ISPAID_ROLLBACK_FAIL = 5;
	/**
	 * 充值支付状态：已退款
	 */
	public static final short CONSUMER_DEPOSIT_ISPAID_HAS_REFUND = 6;
	/**
	 * 销售实体是否支持全本购买：支持
	 */
	public static final int MEDIA_SALE_IS_SUPPORT_FULLBUY = 1;
	/**
	 * 销售实体是否支持全本购买：不支持
	 */
	public static final int MEDIA_SALE_NOT_SUPPORT_FULLBUY = 0;
	/**
	 * 电子书上架状态： 1
	 */
	public static final int MEDIA_SHELF_STATUS_UP = 1;
	/**
	 * 电子书下架状态：0
	 */
	public static final int MEDIA_SHELF_STATUS_DOWN = 0;
    /**
     * 电子书待上架状态：4
     */
    public static final int MEDIA_SHELF_STATUS_TO_UP = 4;
	/**
	 * 是否首次登陆送包月 1：是
	 */
	public static final short FIRST_LOGIN_GIVING_YES = 1;
	/**
	 * 是否首次登陆送包月 0：否
	 */
	public static final short FIRST_LOGIN_GIVING_NOT = 0;
	/**
	 * 是否首次分享送包月 1：是
	 */
	public static final short FIRST_SHARE_GIVING_YES = 1;
	/**
	 * 是否首次分享送包月 0：否
	 */
	public static final short FIRST_SHARE_GIVING_NOT = 0;
	/**
	 * 操作日志：操作结果 成功
	 */
	public static final short MANAGER_OPERATE_RESULT_SUCCESS = 1;
	/**
	 * 操作日志：操作结果 失败
	 */
	public static final short MANAGER_OPERATE_RESULT_FAIL = 0;
	
	/**
	 * 分类状态 启用
	 */
	public static final Integer CATEGORY_STATUS_ENABLE = 1;

	/**
	 * 分类状态禁用
	 */
	public static final Integer CATEGORY_STATUS_DISABLE = 0;
	
	/**
	 * 百度云推送接口地址
	 */
	public static final String BAIDU_CLOUD_PUSH_URL="http://channel.api.duapp.com/rest/2.0/channel/channel";
	public static final String CLOUD_PUSH_API_KEY_PREFIX ="cloud_push_api_key_prefix_";
	
	public static final String CLOUD_PUSH_CONDITION_PARAM_DEFINITION_PREFIX ="cloud_push_condition_param_definition_prefix_";
	
	/**
	 * 精品首页列表缓存key
	 */
	public static final String DIGEST_HOME_PAGE_CACHE = "digest_home_page_cache_";
	public static final long DIGEST_HOME_PAGE_CACHE_EXPIRE_TIME = 6 * 60 * 60;
	
	
	// change it to be 1
	public static final Integer MAX_BOOKLIST_NUMBER_PER_USER = 1;
	// change it to be 5
	public static final Integer MAX_BOOKLIST_MODIFY_NUMBER_PER_MONTH = 5;
	public static final String BOOK_LIST_BASEINFO_CACHE_PREFIX = "book_list_baseinfo_cache_prefix_"; 
	public static final String BOOK_LIST_DETAIL_LIST_CACHE_PREFIX = "book_list_detail_list_cache_prefix_";
	public static final String BOOK_LIST_DETAIL_LIST_FRAGMENT_CACHE_PREFIX = "fragment_";
	public static final Integer BOOK_LIST_DETAIL_LIST_CACHE_FRAGMENT_SIZE = 50;
	
	public static final String PAPER_BOOK_BASICINFO_CACHE_PREFIX ="paper_book_basicinfo_cache_prefix_";
	
	public static final String DIGEST_TO_CHANNEL_CACHE_PREFIX = "digest_to_channel_cache_prefix_"; 
	//epub封面尺寸
	public static final String EPUB_COVER_IMAGE_SIZE = "epub.image.cover.size";
	//原创作品封面尺寸 
	public static final String ORIGINAL_BOOK_COVER_SIZE = "original.book.cover.size";
	
	//中图法分类前缀
	public static final String CATEGORY_ZTF = "CATZTF";
	
	//中图法ID
	public static final String CATEGORY_ZTF_ID = "1";
	
	//电子书分类码
	public static final String DIGITAL_PRODUCT_CATTYPE_ID = "98";
	
	
	/**
	 *书基本信息 前缀
	 */
	public static final String PC_READ_PREFIX = "pc_media_";
	public static final Integer PC_READ_MEDIA_CACHE_TIME = 60*60;
	/**
	 * 字号，总页数 前缀
	 */
	public static final String PC_READ_MEDIA_BURST_PREFIX = "pc_read_media_burst_";
	public static final Integer PC_READ_MEDIA_BURST_CACHE_TIME = 60*60;

	//漫画章节缓存
	public static final String  PC_MH_CHAPTER = "pc_mh_chapter_";
	public static final Integer PC_MH_CHAPTER_CACHE_TIME = 3*60*60;
	
	
	public static final String CHANNEL_ARTICLE_AUTOSAVE_ONE = "channel_article_autosave_one";
	
	public static final String CHANNEL_ARTICLE_AUTOSAVE_MORE = "channel_article_autosave_more";
	
	public static final String CHANNEL_ARTICLE_DIGEST_AUTOSAVE_ONE = "channel_article_digest_autosave_one";
	
	public static final String CHANNEL_ARTICLE_DIGEST_AUTOSAVE_MORE = "channel_article_digest_autosave_more";
	
	public static final String CHANNEL_ARTICLE_DIGEST_MEDIA_AUTOSAVE_ONE = "channel_article_digest_autosave_one";
	
	public static final String CHANNEL_ARTICLE_DIGEST_MEDIA_AUTOSAVE_MORE = "channel_article_digest_autosave_more";
	
	public static final String CHANNEL_RECOMMEND_OTHER_CHANNELES_CACHE_KEY = "channel_recommend_other_channeles_cache_key_";
	public static final String CHANNEL_ARTICLE_DIGEST_REWARDS_TYPE = "WZ";
	/**
	 * 翻篇对应的频道id
	 */
	public static final String CHANNEL_FANPIAN_SPECIAL_ID = "channel_fanpian_special_id";
	/**
	 * 抢先读对应的频道id
	 */
	public static final String CHANNEL_QIANGXIANDU_SPECIAL_ID = "channel_qiangxiandu_special_id";
	/**
	 * 页面布局layout缓存前缀
	 */
	public static final String PAGE_LAYOUT_DETAIL_LIST_CACHE_PREFIX = "page_layout_detail_list_cache_prefix_";
	
	//书籍拓展信息缓存前桌
	public static final String MEDIA_EXPAND_CACHE_PREFIX = "media_expand_cache_prefix_";
	public static final Integer PMEDIA_EXPAND_CACHE_TIME_HOUR = 5;
	
	//章节拓展信息缓存前桌
	public static final String CHAPTER_EXPAND_CACHE_PREFIX = "chapter_expand_cache_prefix_";
	public static final Integer CHAPTER_EXPAND_CACHE_TIME_HOUR = 5;

	public static final String MEDIA_RANKLIST_NEW_KEY ="media_ranklist_new_";

	// 书籍打赏周排行统计到的打赏信息ID
	public static final String REWARD_WEEK_RANK_LAST_ID = "reward_week_rank_last_id";

	// 判断资源是否是VIP免费资源的缓存KEY
	public static final String CACHE_KEY_VIP_CHANNEL_MEDIA = "vip_channel_media_";

	public static final int CACHE_EXPIRE_TIME_VIP_CHANNEL_MEDIA = 15 * 60;

	public static final String CATEGORYALL_MEDIAID_CACHE_KEY ="categoryall_mediaId_cache_";
	public static final int CACHE_EXPIRE_TIME_OF_CATEGORYALL_MEDIAID = 3 * 60 * 60;

	public static final String NEWRANKLIST_DAY_MEDIAID_CACHE_KEY ="newranklist_day_mediaId_cache_";
	public static final int CACHE_EXPIRE_TIME_OF_NEWRANKLIST_DAY_MEDIAID = 3 * 60 * 60;
	public static final String PAYMENT_CACHE_KEY="payment_chche_";
	public static final int CACHE_EXPIRE_TIME_OF_PAYMENT = 1 * 60 * 60;
	public static final String H5_STATIC_REGULARY_PUBLISH = "h5_static_regulary_publish";

	/**
	 * 买了又买调楼上推荐的最多条数
	 */
	public static final int BUYAGAIN_API_RECOMMEND_NUMBER = 50;


	/**
	 * 看了又看 推荐调楼上接口最多条数
	 */
	public static final int READ_ALSO_READ_API_RECOMMEND_NUMBER = 50;
}
