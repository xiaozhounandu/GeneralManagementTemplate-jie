package com.example.demo.controller;

import com.example.demo.entity.SysUser;
import com.example.demo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    //添加接口方法：
    @GetMapping("/")
    public String index(){
        return "欢迎访问";
    }


    @GetMapping("/getUser")
    public SysUser getUser(Long id){
        return sysUserService.getById(id);
    }

    @PostMapping("/addUser")
    public String addUser(SysUser sysUser){
        sysUser.setCreateTime(new Date());
        return sysUserService.save(sysUser)?"保存成功":"保存失败";
    }
    @PutMapping("/updateUser")
    public String updateUser(SysUser sysUser){
        return sysUserService.updateById(sysUser)?"修改成功":"修改失败";
    }

    @GetMapping("/list")
    public List<SysUser> list(){
        return sysUserService.list();
    }
}
