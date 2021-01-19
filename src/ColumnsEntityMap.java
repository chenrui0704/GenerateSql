import java.util.HashMap;
import java.util.Map;

public class ColumnsEntityMap {

    /**
     *
     * key: 中文名
     * value: 对应的字段信息
     *     <p>
     *         name: 英文名
     *         type: 字段类型
     *         length: 字段长度
     *     </p>
     * */
    public static Map<String, ColumnsEntity> getData(){
        Map<String, ColumnsEntity> data = new HashMap<>();

        data.put("中文品名", new ColumnsEntity("chinese_name", "varchar", 255));
        data.put("英文品名", new ColumnsEntity("english_name",  255));
        data.put("换单日期", new ColumnsEntity("swap_time", "datetime", 0));

        data.put("船名", new ColumnsEntity("ship_name", 50));
        data.put("航次", new ColumnsEntity("voyage", 50));
        data.put("提单号", new ColumnsEntity("bill_no", 50));
        data.put("船公司", new ColumnsEntity("ship_company", 255));

        data.put("合同号", new ColumnsEntity("contract_no", 50));
        data.put("委托客户", new ColumnsEntity("entrust_customer", 50));


        return data;
    }

}
