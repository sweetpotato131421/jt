package com.jt.vo;

public class SysResult {
    private Integer status;
    private String msg;
    private Object data;
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public static SysResult build(Integer status,
                                  String msg,Object data){
        SysResult result=new SysResult();
        result.setStatus(status);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }
}

