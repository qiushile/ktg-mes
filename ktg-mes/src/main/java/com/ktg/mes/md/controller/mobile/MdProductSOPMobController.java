package com.ktg.mes.md.controller.mobile;

import com.ktg.common.core.controller.BaseController;
import com.ktg.common.core.domain.AjaxResult;
import com.ktg.mes.md.domain.MdProductSop;
import com.ktg.mes.md.service.IMdProductSopService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "产品SOP信息")
@RestController
@RequestMapping("/mobile/md/sop")
public class MdProductSOPMobController extends BaseController {
    @Autowired
    private IMdProductSopService mdProductSopService;

    /**
     * 查询产品SOP列表
     */
    @ApiOperation("查询产品SOP信息")
    @GetMapping("/list")
    public AjaxResult list(MdProductSop mdProdutSop)
    {
        startPage();
        List<MdProductSop> list = mdProductSopService.selectMdProductSopList(mdProdutSop);
        return AjaxResult.success(list);
    }
}
