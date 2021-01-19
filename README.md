# 根据维护的字典信息进行创建表,添加列的Sql语句生成

##### 说明
    维护中文名及对应的字段信息(英文名,类型,长度)等, 生成对应的创建表Sql语句和添加列Sql语句
    
 ##### 步骤
    
    1. ColumnsEntityMap.class, getData()
        维护对应的信息
        Map<String, ColumnsEntity> data = new HashMap<>();
        data.put("中文品名", new ColumnsEntity("chinese_name", "varchar", 255));
        data.put("英文品名", new ColumnsEntity("english_name",  255));
        data.put("换单日期", new ColumnsEntity("swap_time", "datetime", 0));
     
    2. GenerateCreateTableSql/.class, main()
        生成创建表语句, 输入表名后进行生成
        
        print:
        create table swap (
        	id bigint(20) primary key auto_increment,
        	chinese_name varchar(255) default null COMMENT '中文品名',
        	english_name varchar(255) default null COMMENT '英文品名',
        	swap_time datetime(0) default null COMMENT '换单日期',
        	valid_status int(20) default null COMMENT '0 = 作废, 1 = 有效',
        	inputer int(20) default null COMMENT '录入人',
        	input_time datetime(0) default null COMMENT '录入时间',
        	updater int(20) default null COMMENT '更新人',
        	update_time datetime(0) default null COMMENT '更新时间'
        )
    3. GenerateBasicColumnsSql.class, main()
        生成基础字段ADD COLUMNS语句, 输入表名后进行生成
        
        print:
        ALTER TABLE swap2 ADD COLUMN `inputer` int(20)  default null COMMENT '录入人';
        ALTER TABLE swap2 ADD COLUMN `input_time` datetime default null COMMENT '录入时间';
        ALTER TABLE swap2 ADD COLUMN `updater` int(20)  default null COMMENT '更新人';
        ALTER TABLE swap2 ADD COLUMN `update_time` datetime  default null COMMENT '更新时间';
        ALTER TABLE swap2 ADD COLUMN `valid_status` int(1) default null COMMENT '0 = 作废, 1 = 有效';
        ALTER TABLE swap2 ADD COLUMN `saas_id` int(20)  default null;
    3. GenerateAddColumnSql.class, main()
        生成字段ADD COLUMNS语句, 输入表名后进行生成
        
        print:
        ALTER TABLE swap ADD COLUMN `chinese_name` varchar(255)  default null COMMENT '中文品名';
        ALTER TABLE swap ADD COLUMN `english_name` varchar(255)  default null COMMENT '英文品名';
        ALTER TABLE swap ADD COLUMN `swap_time` datetime(0)  default null COMMENT '换单日期';
        ALTER TABLE swap ADD COLUMN `inputer` int(20)  default null COMMENT '录入人';
        ALTER TABLE swap ADD COLUMN `input_time` datetime default null COMMENT '录入时间';
        ALTER TABLE swap ADD COLUMN `updater` int(20)  default null COMMENT '更新人';
        ALTER TABLE swap ADD COLUMN `update_time` datetime  default null COMMENT '更新时间';
        ALTER TABLE swap ADD COLUMN `valid_status` int(1) default null COMMENT '0 = 作废, 1 = 有效';
        ALTER TABLE swap ADD COLUMN `saas_id` int(20)  default null;
