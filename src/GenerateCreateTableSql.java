import java.util.HashMap;
import java.util.Map;

public class GenerateCreateTableSql {

    public static void main(String[] args) {
        // 需要输入表名
        String tableName = "sea_out_clearance";

        Map<String, ColumnsEntity> columnsEntityMap = ColumnsEntityMap.getData();
        String data = getData();
        String [] array = data.split("\n");

        String sql = "create table " + tableName + " (\n" +
                "\tid bigint(20) primary key auto_increment,\n"+
                "\torder_id bigint(20) default null ,\n";

        for (String column : array) {
            ColumnsEntity columnsEntity = columnsEntityMap.get(column);
            if(null != columnsEntity){
                sql += "\t" + columnsEntity.getName() + " " + columnsEntity.getType() + "(" + columnsEntity.getLength() + ") default null COMMENT '" + column + "',\n";
            }
        }
        sql += "\tvalid_status int(20) default null COMMENT '0 = 作废, 1 = 有效',\n" +
                "\tsaas_id int(20) default null,\n" +
                "\tinputer int(20) default null COMMENT '录入人',\n" +
                "\tinput_time datetime(0) default null COMMENT '录入时间',\n" +
                "\tupdater int(20) default null COMMENT '更新人',\n" +
                "\tupdate_time datetime(0) default null COMMENT '更新时间',\n";

        sql = sql.substring(0, sql.length() - 2) + "\n)";
        System.out.println(sql);
    }

    public static String getData(){
        return "报关单号\n" +
                "报关备注\n" +
                "报关类型\n" +
                "报关员\t\n" +
                "报关放行日\n" +
                "查验计划日\n" +
                "查验日\n" +
                "查验地点\n" +
                "查验结果\n" +
                "查验备注";
    }

}
