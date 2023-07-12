package top.xqf.springboot.study2.base;

import java.io.Serializable;

public class BaseResult<T> implements Serializable {

  private static final long serialVersionUID = 1L;

  private int code = 500;
  private boolean success = false;
  private String message = "";
  private T data;
  private String token;

  public BaseResult() {
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public boolean isSuccess() {
    return success;
  }

  public void setSuccess(boolean success) {
    this.success = success;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }
}
