package xin.fallen.util;

import xin.fallen.vo.JsonResult;

/**
 * Author: Fallen
 * Date: 2017/3/6
 * Time: 10:31
 * Usage:
 */
public class JsonResultUtil {

    public static JsonResult resDispatcher(Object data) {
        return data == null ? getFailRes() : getSuccessRes(data);
    }

    public static JsonResult resDispatcher(String successMsg, String failMsg, Object data) {
        return data == null ? getFailRes(failMsg) : getSuccessRes(successMsg, data);
    }

    public static JsonResult resDispatcher(int status) {
        return status == 0 ? getFailRes() : getSuccessRes();
    }

    private static JsonResult getSuccessRes(String msg, Object data) {
        JsonResult jr = new JsonResult();
        jr.setRes("1");
        jr.setRes(msg);
        jr.setData(data);
        return jr;
    }

    private static JsonResult getSuccessRes(Object data) {
        JsonResult jr = new JsonResult();
        jr.setRes("1");
        jr.setMsg("操作成功");
        jr.setData(data);
        return jr;
    }

    private static JsonResult getSuccessRes() {
        JsonResult jr = new JsonResult();
        jr.setRes("1");
        jr.setMsg("操作成功");
        return jr;
    }

    private static JsonResult getFailRes(String res) {
        JsonResult jr = new JsonResult();
        jr.setRes("0");
        jr.setMsg(res);
        return jr;
    }

    private static JsonResult getFailRes() {
        JsonResult jr = new JsonResult();
        jr.setRes("0");
        jr.setMsg("操作失败");
        return jr;
    }
}