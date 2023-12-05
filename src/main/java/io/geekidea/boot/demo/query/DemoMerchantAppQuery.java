package io.geekidea.boot.demo.query;

import io.geekidea.boot.framework.page.BasePageQuery;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * App测试商户查询参数
 *
 * @author geekidea
 * @since 2023-12-05
 */
@Data
@Schema(description = "App测试商户查询参数")
public class DemoMerchantAppQuery extends BasePageQuery {
    private static final long serialVersionUID = 1L;

}

