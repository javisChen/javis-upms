package javis.app.common.contants;

/**
 * 常量管理
 */
public class Const {

    /* 用户类型 */
    public interface UserType {
        int DEFAULT = 0; // 默认
        int STUDENT = 1; // 学生
        int TEACHER = 2; // 老师
        int MERCHANT = 3; // 商家
        int MANAGER = 4; // 运营管理
    }

    /* 商户认证状态 */
    public interface MerchantVerifyState {
        int NOT_APPLY = 0; // 未提交资料
        int UNVERIFIED = 1; // 已提交资料（待认证）
        int PASSED = 2; // 已通过
        int NOT_PASS = 3; // 不通过
    }

    /* 商户租赁状态状态 */
    public interface MerchantLeaseState {
        int DEFAULT = 0; // 默认
        int PROBATION_PERIOD = 1; // 试用期
        int NORMAL = 2; // 正常
        int ARREARAGE = 3; // 欠费
        int DISUCSE = 4; // 停用
    }

    /* 商户租赁状态状态 */
    public interface NotifyState {
        int OPEN = 1; // 开放
        int CLOSE = 2; // 已屏蔽
    }

    /* 通知推送对象 */
    public interface NotifyPushObject {
        int ALL_STUDENT = 1; // 全体学员
        int ALL_PERSON_FOR_MERCHANT = 2; // 某一个培训机构的全体师生
        int PASSED_MERCHANT = 3; // 全部认证商家
        int NORMAL_REGISTER_MERCHANT = 4; // 全部普通注册商家
        int PROBATION_PERIOD_MERCHANT = 5; // 试用期商家
        int ARREARAGE_MERCHANT = 6; // 欠费商家
        int LAST_MONTH_MERCHANT = 7; // 一个月内租期到期的商家
        int SINGLE_MERCHANT = 8; // 一个月内租期到期的商家v
        int ALL_TEACHER = 9; // 某一个培训机构的全体师生
    }

    /* 通知推送渠道 */
    public interface NotifyPushChannel {
        int APP = 1; // APP
        int SMS = 2; // 短信
        int PC = 3; // 培训机构管理PC端
    }

    /* 通知推送渠道 */
    public interface MessageTemplate {
        String VERIFY_PASS_SMS = "恭喜您已经通过课吧商家认证，登录app即可获取管理平台相关信息。管理平台将提供最便捷的、免费的管理服务。";
        String VERIFY_PASS_APP = "【课吧】恭喜您已经通过课吧商家认证，请在app“我”频道中打开管理平台栏目，获取管理平台访问地址已经操作指南，即可开始老师、课程、学员的管理工作。";
        String VERIFY_NOT_PASS_SMS = "很抱歉，您提交的商家认证审核不通过，原因是“{{reason}}”。请登录app重新进行认证信息填写与提交。";
        String VERIFY_NOT_PASS_APP = "【课吧】很抱歉，您提交的商家认证审核不通过，原因是“{{reason}}”。请重新在app中进行认证信息填写与提交。";
        String NOTIFY_OPERATION = "有一条新的认证申请，请及时处理，后台链接：http://www.keba123.com/vdance/";
    }

    /* 课堂状态 */
    public interface CourseScheduleState {
        int NORMAL = 0; // 正常
        int SUSPEND = 1; // 停课（待认证）
        int ADJUST = 2; // 调课2
    }

    /**
     * 删除标识
     */
    public interface DeleteFlag {
        int DISABLE = 1;
    }

    /**
     * 课程状态
     */
    public interface CourseState {
        int AVAILABLE = 0;
        int DISABLED = 1;
    }
}
