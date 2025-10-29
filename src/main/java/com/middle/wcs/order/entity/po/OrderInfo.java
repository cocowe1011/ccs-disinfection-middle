package com.middle.wcs.order.entity.po;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * (OrderInfo)实体类
 *
 * @author makejava
 * @since 2024-12-28 23:59:48
 */
@Data
@TableName("order_info")
public class OrderInfo {
    /**
    * 主键
    */
    @TableId
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
    * 插入时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date insertTime;

    /**
    * 生产总订单号
    */
    private String orderId;

    /**
    * 生产单批次订单ID
    */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long batchId;

    /**
    * 产品编号
    */
    private String productCode;

    /**
    * 产品名称
    */
    private String productName;

    /**
    * 指定预热房（A-G）
    */
    private String isPrint1;

    /**
    * 指定灭菌柜（A-G）
    */
    private String isPrint2;

    /**
    * 指定输出，0：一楼 1、解析库 2、立体库
    */
    private String isPrint3;

    /**
    * 单批次16个托盘码逗号间隔
    */
    private String qrCode;

    /**
    * 进货口指定，1、一楼外部进货。2、2楼进货。3、三楼进货。4、不解析出口
    */
    private String inPut;

    /**
    * 订单状态，0待执行1执行中2已暂停3已完成
    */
    private String orderStatus;

    /**
     * 作废标识，0未作废，1作废
     */
    private String invalidFlag;

    /**
     * 规格
     */
    private String spec;

    /**
     * 是否手动添加的订单,1：手动 其他：MSE
     */
    private String isManual;

    /**
     * 添加用户姓名
     */
    private String createrName;
    /**
     * 添加订单的用户code
     */
    private String createrCode;
    /**
     * 订单执行人
     */
    private String executorName;
    /**
     * 订单执行人code
     */
    private String executorCode;
    /**
     * 订单完成人姓名
     */
    private String finisherName;
    /**
     * 订单完成人code
     */
    private String finisherCode;

    /**
     * 订单完成时间
     */
    private Date finishTime;
}
