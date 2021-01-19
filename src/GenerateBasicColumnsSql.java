public class GenerateBasicColumnsSql {

    public static void main(String[] args) {
        // 需要输入表名
        String tableName = "swap2";

        System.out.println(getData(tableName));

    }

    public static String getData(String tableName){
        return  "ALTER TABLE " + tableName + " ADD COLUMN `inputer` int(20)  default null COMMENT '录入人';\n" +
                "ALTER TABLE " + tableName + " ADD COLUMN `input_time` datetime default null COMMENT '录入时间';\n" +
                "ALTER TABLE " + tableName + " ADD COLUMN `updater` int(20)  default null COMMENT '更新人';\n" +
                "ALTER TABLE " + tableName + " ADD COLUMN `update_time` datetime  default null COMMENT '更新时间';\n" +
                "ALTER TABLE " + tableName + " ADD COLUMN `valid_status` int(1) default null COMMENT '0 = 作废, 1 = 有效';\n" +
                "ALTER TABLE " + tableName + " ADD COLUMN `saas_id` int(20)  default null;";
    }

}
