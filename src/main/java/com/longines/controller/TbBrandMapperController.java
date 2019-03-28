package com.longines.controller;

import com.longines.pojo.TbBrand;
import com.longines.service.TbBrandMapperService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;


@CrossOrigin
@Controller
@RequestMapping("/TbBrands")
public class TbBrandMapperController {
    @Resource
    private TbBrandMapperService tbBrandMapperService;
    @ResponseBody
    @PostMapping("brands")
    public List<TbBrand> findAllBrands()
    {
        List<TbBrand> brandList=tbBrandMapperService.findAllBrand();
        if (brandList==null)
        {
            return null;
        }
        else
        {
            return brandList;
            //test
        }
    }
}
