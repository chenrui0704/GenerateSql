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

        data.put("仓库联系单号", new ColumnsEntity("warehouse_no", 50));
        data.put("联系目的", new ColumnsEntity("purpose", 50));
        data.put("预计出仓日期", new ColumnsEntity("expected_out_time","datetime", 0));
        data.put("仓库", new ColumnsEntity("warehouse", 255));
        data.put("仓库联系人", new ColumnsEntity("warehouse_contact", 50));
        data.put("仓库电话", new ColumnsEntity("warehouse_phone", 50));
        data.put("仓库地址", new ColumnsEntity("warehouse_address", 255));
        data.put("受理情况", new ColumnsEntity("acceptance", 255));
        data.put("客户联系人", new ColumnsEntity("customer_contact", 50));
        data.put("客户电话", new ColumnsEntity("customer_phone", 50));
        data.put("实际受理日期", new ColumnsEntity("actual_acceptance_date","datetime", 0));
        data.put("仓储要求", new ColumnsEntity("storage_requirements", 255));

        data.put("卸货港", new ColumnsEntity("discharge_port", 255));
        data.put("还箱日", new ColumnsEntity("return_box_time","datetime", 0));
        data.put("是否超期", new ColumnsEntity("overdue_state", 255));
        data.put("是否免箱", new ColumnsEntity("free_box_state", 255));
        data.put("运输地点", new ColumnsEntity("trans_address", 255));
        data.put("送箱情况", new ColumnsEntity("delivery_situation", 255));

        data.put("箱号", new ColumnsEntity("box_no", 255));
        data.put("提箱点", new ColumnsEntity("carry_point", 255));
        data.put("送达地点", new ColumnsEntity("delivery_location", 255));
        data.put("送货日", new ColumnsEntity("delivery_time", "datetime", 0));
        data.put("车号", new ColumnsEntity("car_no", 255));
        data.put("运费", new ColumnsEntity("fee", 255));
        data.put("车队", new ColumnsEntity("fleet", 255));
        data.put("备注", new ColumnsEntity("remarks", 255));


        data.put("报关公司", new ColumnsEntity("broker_company", 255));
        data.put("报关行", new ColumnsEntity("broker_company", 255));
        data.put("报关单号", new ColumnsEntity("broker_no", 255));
        data.put("报关员", new ColumnsEntity("broker", 255));
        data.put("报关备注", new ColumnsEntity("broker_remarks", 255));
        data.put("报关单流入日", new ColumnsEntity("broker_out_time", "datetime", 0));
        data.put("报关单流出日", new ColumnsEntity("broker_in_time", "datetime", 0));
        data.put("报关单签收日", new ColumnsEntity("broker_receipt_time", "datetime", 0));


        data.put("出税日", new ColumnsEntity("tax_out_time", "datetime", 0));
        data.put("付税日", new ColumnsEntity("tax_in_time", "datetime", 0));
        data.put("税单流入日", new ColumnsEntity("tax_order_out_time", "datetime", 0));
        data.put("税单流出日", new ColumnsEntity("tax_order_in_time", "datetime", 0));
        data.put("税单签收日", new ColumnsEntity("tax_receipt_time", "datetime", 0));
        data.put("转税日", new ColumnsEntity("tax_replace_time", 255));

        data.put("商检日", new ColumnsEntity("commodity_inspection_time", "datetime", 0));
        data.put("送单日", new ColumnsEntity("send_order_time", "datetime", 0));
        data.put("申报日", new ColumnsEntity("declare_time", "datetime", 0));
        data.put("放行日", new ColumnsEntity("release_time", "datetime", 0));

        data.put("联单数", new ColumnsEntity("union_number", 255));
        data.put("是否查验", new ColumnsEntity("check_state", "int", 1));
        data.put("查验计划日", new ColumnsEntity("check_plan_time", "datetime", 0));
        data.put("查验日", new ColumnsEntity("check_time", "datetime", 0));
        data.put("计划查验日", new ColumnsEntity("check_expect_time", "datetime", 0));
        data.put("查验放行日", new ColumnsEntity("check_release_time", "datetime", 0));
        data.put("查验地点", new ColumnsEntity("check_address", 255));
        data.put("查验备注", new ColumnsEntity("check_remarks", 255));
        data.put("查验结果", new ColumnsEntity("check_result", 255));

        data.put("报检号", new ColumnsEntity("inspection_no", 255));

        data.put("检验地点", new ColumnsEntity("examine_address", 255));
        data.put("检验时间", new ColumnsEntity("examine_time", "datetime", 0));
        data.put("检验备注", new ColumnsEntity("examine_remarks", 255));

        data.put("送交日期", new ColumnsEntity("deliver_time", "datetime", 0));

        data.put("保证金类型", new ColumnsEntity("margin_type", 255));
        data.put("保证金完成日", new ColumnsEntity("margin_complete_time", "datetime", 0));

        data.put("申请退保日", new ColumnsEntity("return_insure_apply_time", "datetime", 0));
        data.put("退保状态", new ColumnsEntity("return_insure_state", 255));
        data.put("退保退税依据", new ColumnsEntity("return_description", 255));

        data.put("审价日期", new ColumnsEntity("review_price_time", "datetime", 0));
        data.put("审价通过日", new ColumnsEntity("review_price_success_time", "datetime", 0));
        data.put("收据号", new ColumnsEntity("receipt_no", 255));


        data.put("工作号", new ColumnsEntity("job_number", 255));
        data.put("联系人", new ColumnsEntity("contact", 255));
        data.put("运输状态", new ColumnsEntity("trans_state", "int", 1));
        data.put("仓库状态", new ColumnsEntity("warehouse_state", "int", 1));
        data.put("委托方", new ColumnsEntity("client", 255));
        data.put("客户号", new ColumnsEntity("client_no", 255));
        data.put("国外代理", new ColumnsEntity("foreign_agent", 255));
        data.put("货物类型", new ColumnsEntity("cargo_type", 255));
        data.put("外托代理", new ColumnsEntity("outsourcing_agent", 255));
        data.put("报关状态", new ColumnsEntity("clearance_state", 255));
        data.put("上机时间", new ColumnsEntity("machine_time", "datetime", 0));
        data.put("放行时间", new ColumnsEntity("release_time", "datetime", 0));
        data.put("委托日期", new ColumnsEntity("commission_time", "datetime", 0));
        data.put("分单号", new ColumnsEntity("hwb_no",  255));
        data.put("IATA代码", new ColumnsEntity("iata_code",  255));
        data.put("代理人", new ColumnsEntity("agent",  255));
        data.put("航空公司", new ColumnsEntity("airline",  255));
        data.put("航班", new ColumnsEntity("flight",  255));
        data.put("开航日期", new ColumnsEntity("flight_time",  "datetime", 0));
        data.put("运输声明", new ColumnsEntity("trans_statement",  255));
        data.put("海关声明", new ColumnsEntity("clearance_statement",  255));
        data.put("支付方式", new ColumnsEntity("payment_method",  255));
        data.put("处理情况", new ColumnsEntity("handling_situation",  255));

        data.put("发货人", new ColumnsEntity("consigner",  255));
        data.put("始发站", new ColumnsEntity("departure_station",  255));
        data.put("收货人", new ColumnsEntity("consignee",  255));
        data.put("承运人", new ColumnsEntity("carrier",  255));

        data.put("中转站一", new ColumnsEntity("transfer_station_one",  255));
        data.put("承运人一", new ColumnsEntity("carrier_one",  255));
        data.put("中转站二", new ColumnsEntity("transfer_station_two",  255));
       data.put("承运人二", new ColumnsEntity("carrier_two",  255));
        data.put("中转站三", new ColumnsEntity("transfer_station_three",  255));
        data.put("承运人三", new ColumnsEntity("carrier_three",  255));
        data.put("目的站", new ColumnsEntity("destination_station",  255));

        data.put("币制", new ColumnsEntity("currency",  255));
        data.put("包装", new ColumnsEntity("packages",  255));
        data.put("件数", new ColumnsEntity("pieces",  255));
        data.put("尺码", new ColumnsEntity("cbm",  255));
        data.put("毛重", new ColumnsEntity("gross_weight",  255));

        data.put("运价级别", new ColumnsEntity("freight_level",  255));
        data.put("商品代码", new ColumnsEntity("commodity_weight",  255));
        data.put("计费重量", new ColumnsEntity("fee_weight",  255));
        data.put("货物描述", new ColumnsEntity("cargo_description",  "text", 0));

        data.put("业务类型", new ColumnsEntity("business_type",  255));
        data.put("部门", new ColumnsEntity("department",  255));
        data.put("销售", new ColumnsEntity("sales",  255));
        data.put("客服", new ColumnsEntity("customer_service",  255));


        data.put("单证类型", new ColumnsEntity("document_type",  255));
        data.put("单证号码", new ColumnsEntity("document_no",  255));
        data.put("发件人", new ColumnsEntity("sender",  255));
        data.put("发件日期", new ColumnsEntity("send_time",  "datetime", 0));
        data.put("收件人", new ColumnsEntity("receive",  255));
        data.put("返回日期", new ColumnsEntity("return_time",  "datetime", 0));







        return data;
    }

}
