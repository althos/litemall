package org.linlinjava.litemall.db.util;

public class OrderHandleOption {
    /**
     *  取消操作
     */
    private boolean cancel = false;
    /**
     * 删除操作
     */
    private boolean delete = false;
    /**
     * 支付操作
     */
    private boolean pay = false;
    /**
     * 评论操作
     */
    private boolean comment = false;
    /**
     * 确认收货操作
     */
    private boolean confirm = false;
    /**
     * 取消订单并退款操作
     */
    private boolean refund = false;
    /**
     * 再次购买
     */
    private boolean rebuy = false;

    public boolean isCancel() {
        return cancel;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    public boolean isPay() {
        return pay;
    }

    public void setPay(boolean pay) {
        this.pay = pay;
    }

    public boolean isComment() {
        return comment;
    }

    public void setComment(boolean comment) {
        this.comment = comment;
    }

    public boolean isConfirm() {
        return confirm;
    }

    public void setConfirm(boolean confirm) {
        this.confirm = confirm;
    }

    public boolean isRefund() {
        return refund;
    }

    public void setRefund(boolean refund) {
        this.refund = refund;
    }

    public boolean isRebuy() {
        return rebuy;
    }

    public void setRebuy(boolean rebuy) {
        this.rebuy = rebuy;
    }

}
