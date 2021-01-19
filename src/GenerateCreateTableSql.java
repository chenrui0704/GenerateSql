import java.util.HashMap;
import java.util.Map;

public class GenerateCreateTableSql {

    public static void main(String[] args) {
        // 需要输入表名
        String tableName = "swap";

        Map<String, ColumnsEntity> columnsEntityMap = ColumnsEntityMap.getData();
        String data = getData();
        String [] array = data.split("\n");

        String sql = "create table " + tableName + " (\n" +
                "\tid bigint(20) primary key auto_increment,\n";

        for (String column : array) {
            ColumnsEntity columnsEntity = columnsEntityMap.get(column);
            if(null != columnsEntity){
                sql += "\t" + columnsEntity.getName() + " " + columnsEntity.getType() + "(" + columnsEntity.getLength() + ") default null COMMENT '" + column + "',\n";
            }
        }
        sql += "\tvalid_status int(20) default null COMMENT '0 = 作废, 1 = 有效',\n" +
                "\tinputer int(20) default null COMMENT '录入人',\n" +
                "\tinput_time datetime(0) default null COMMENT '录入时间',\n" +
                "\tupdater int(20) default null COMMENT '更新人',\n" +
                "\tupdate_time datetime(0) default null COMMENT '更新时间',\n";

        sql = sql.substring(0, sql.length() - 2) + "\n)";
        System.out.println(sql);
    }

    public static String getData(){
        return "中文品名\n" +
                "英文品名\n" +
                "英文品名2\n" +
                "换单日期";
    }

}
