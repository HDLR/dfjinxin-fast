/**
 * 2019 东方金信
 *
 *
 *
 *
 */

package io.dfjinxin.modules.app.service;


import com.baomidou.mybatisplus.extension.service.IService;
import io.dfjinxin.modules.app.entity.UserEntity;
import io.dfjinxin.modules.app.form.LoginForm;

/**
 * 用户
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface UserService extends IService<UserEntity> {

	UserEntity queryByMobile(String mobile);

	/**
	 * 用户登录
	 * @param form    登录表单
	 * @return        返回用户ID
	 */
	long login(LoginForm form);
}
