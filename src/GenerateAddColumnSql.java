import java.util.Map;

public class GenerateAddColumnSql {

    public static void main(String[] args) {
        // 需要输入表名
        String tableName = "swap";

        Map<String, ColumnsEntity> columnsEntityMap = ColumnsEntityMap.getData();
        String data = getData();
        String [] array = data.split("\n");

        String sql = "";

        for (String column : array) {
            ColumnsEntity columnsEntity = columnsEntityMap.get(column);
            if(null != columnsEntity){
                sql += "ALTER TABLE " + tableName + " ADD COLUMN `" + columnsEntity.getName() + "` " + columnsEntity.getType() + "(" + columnsEntity.getLength() + ")  default null COMMENT '" + column + "';\n";
            }
        }

        sql += "ALTER TABLE " + tableName + " ADD COLUMN `inputer` int(20)  default null COMMENT '录入人';\n" +
               "ALTER TABLE " + tableName + " ADD COLUMN `input_time` datetime default null COMMENT '录入时间';\n" +
               "ALTER TABLE " + tableName + " ADD COLUMN `updater` int(20)  default null COMMENT '更新人';\n" +
               "ALTER TABLE " + tableName + " ADD COLUMN `update_time` datetime  default null COMMENT '更新时间';\n" +
               "ALTER TABLE " + tableName + " ADD COLUMN `valid_status` int(1) default null COMMENT '0 = 作废, 1 = 有效';\n" +
               "ALTER TABLE " + tableName + " ADD COLUMN `saas_id` int(20)  default null;";

        System.out.println(sql);
    }

    public static String getData(){
        return "中文品名\n" +
                "英文品名\n" +
                "英文品名2\n" +
                "换单日期";
    }


}
