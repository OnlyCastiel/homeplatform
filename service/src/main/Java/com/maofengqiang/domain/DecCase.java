package com.maofengqiang.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class DecCase implements Serializable {
    /** 主键id,作为@BizId */
    private String id;

    /** 案例名称 */
    private String caseName;

    /** 关联的楼盘id */
    private String bid;

    /** 关联的楼盘的位置 */
    private String blocation;

    /** 关联的楼盘名字 */
    private String baseName;

    /** 关联的楼栋id */
    private String buildingId;

    /** 关联的楼栋的名字 */
    private String buildingName;

    /** 关联的户型的id */
    private String houseLayoutId;

    /** 关联的户型的名字 */
    private String houseLayoutName;

    /** 关联的房型的id，如一居室，二居室 */
    private String houseTypeId;

    /** 关联的房型的名字 */
    private String houseTypeName;

    /** 关联的房型详情id，如一室一厅，两室一厅 */
    private String houseTypeDetailId;

    /** 关联的房型详情的名字 */
    private String houseTypeDetailName;

    /** 装修面积 */
    private Integer decArea;

    /** 设计风格 */
    private String designStyle;

    /** 装修模式 */
    private String decMode;

    /** 案例的装修状态，比如设计，施工，竣工等 */
    private String caseDecStatus;

    /** 案例标签，集合，以,号分割 */
    private String tagList;

    /** 装修价格,单位为万元 */
    private BigDecimal price;

    /** 封面图片原图 */
    private String coverImgOrigin;

    /** 封面图片处理过后的图片,4比3的比例 */
    private String coverImgDisposeFourThree;

    /** 案例主人id */
    private String authorid;

    /** 浏览量 */
    private Integer browseNum;

    /** 收藏量 */
    private Integer collectNum;

    /** 总评分 */
    private BigDecimal score;

    /** 状态枚举 ,1为已通过,2为删除,3为待审核,4为未通过 */
    private Integer caseStatus;

    /** 装修环节，冗余字段以逗号为分割 */
    private String decLink;

    /** 装修空间，冗余字段以逗号为分割 */
    private String decSpace;

    /** 服务商id，冗余字段以逗号为分割 */
    private String decServiceProvider;

    /** 是否为监理点评 */
    private Integer supervisorComment;

    /** 是否为业主上传 */
    private Integer ownerUpload;

    /** 创建时间 */
    private Date gmtCreated;

    /** 修改时间 */
    private Date gmtModified;

    /** 创建人 */
    private String createdBy;

    /** 修改人 */
    private String modifiedBy;

    /** 热度 */
    private Integer hotNum;

    /** 评论量 */
    private Integer commentNum;

    /** 案例简介 */
    private String caseIntroduction;

    /** 关联的服务商表的id */
    private String associationServiceProviderId;

    /** 服务商电话 */
    private String serviceProviderPhoneNum;

    /** 未通过原因 */
    private String failReason;

    /** 案例需求 */
    private String decRequire;

    /** 开工时间 */
    private Date startTime;

    /** 完工时间 */
    private Date finishTime;

    /** 设计师 */
    private String caseDesigner;

    /** 工长 */
    private String foreman;

    /** 监理 */
    private String supervisor;

    /** 上传费用清单 */
    private String chargeList;

    /** 装修每平方价格,单位为元  */
    private BigDecimal squarePrice;

    /** 设计师id */
    private String caseDesignerId;

    /** 工长id */
    private String foremanId;

    /** 监理id */
    private String supervisorId;

    /** 装修公司名字 */
    private String serviceProviderName;

    /** id属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String idExpression;

    /** caseName属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String caseNameExpression;

    /** bid属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String bidExpression;

    /** blocation属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String blocationExpression;

    /** baseName属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String baseNameExpression;

    /** buildingId属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String buildingIdExpression;

    /** buildingName属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String buildingNameExpression;

    /** houseLayoutId属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String houseLayoutIdExpression;

    /** houseLayoutName属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String houseLayoutNameExpression;

    /** houseTypeId属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String houseTypeIdExpression;

    /** houseTypeName属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String houseTypeNameExpression;

    /** houseTypeDetailId属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String houseTypeDetailIdExpression;

    /** houseTypeDetailName属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String houseTypeDetailNameExpression;

    /** decArea属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String decAreaExpression;

    /** designStyle属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String designStyleExpression;

    /** decMode属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String decModeExpression;

    /** caseDecStatus属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String caseDecStatusExpression;

    /** tagList属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String tagListExpression;

    /** price属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String priceExpression;

    /** coverImgOrigin属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String coverImgOriginExpression;

    /** coverImgDisposeFourThree属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String coverImgDisposeFourThreeExpression;

    /** authorid属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String authoridExpression;

    /** browseNum属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String browseNumExpression;

    /** collectNum属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String collectNumExpression;

    /** score属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String scoreExpression;

    /** caseStatus属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String caseStatusExpression;

    /** decLink属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String decLinkExpression;

    /** decSpace属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String decSpaceExpression;

    /** decServiceProvider属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String decServiceProviderExpression;

    /** supervisorComment属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String supervisorCommentExpression;

    /** ownerUpload属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String ownerUploadExpression;

    /** gmtCreated属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String gmtCreatedExpression;

    /** gmtModified属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String gmtModifiedExpression;

    /** createdBy属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String createdByExpression;

    /** modifiedBy属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String modifiedByExpression;

    /** hotNum属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String hotNumExpression;

    /** commentNum属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String commentNumExpression;

    /** caseIntroduction属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String caseIntroductionExpression;

    /** associationServiceProviderId属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String associationServiceProviderIdExpression;

    /** serviceProviderPhoneNum属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String serviceProviderPhoneNumExpression;

    /** failReason属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String failReasonExpression;

    /** decRequire属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String decRequireExpression;

    /** startTime属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String startTimeExpression;

    /** finishTime属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String finishTimeExpression;

    /** caseDesigner属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String caseDesignerExpression;

    /** foreman属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String foremanExpression;

    /** supervisor属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String supervisorExpression;

    /** chargeList属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String chargeListExpression;

    /** squarePrice属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String squarePriceExpression;

    /** caseDesignerId属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String caseDesignerIdExpression;

    /** foremanId属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String foremanIdExpression;

    /** supervisorId属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String supervisorIdExpression;

    /** serviceProviderName属性对应的表达式属性，
     * 目前用来支持update set 字段=表达式(如:'字段+1')这种场景
     **/
    @JsonIgnore
    private String serviceProviderNameExpression;

    private static final long serialVersionUID = 1L;
}