package com.volunteer.uapply.controller;

import com.volunteer.uapply.pojo.Resume;
import com.volunteer.uapply.pojo.ResumeScorePO;
import com.volunteer.uapply.sevice.ResumeService;
import com.volunteer.uapply.utils.response.UniversalResponseBody;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


/**
 * 简历
 *
 * @author 郭树耸
 * @version 1.0
 * @date 2020/2/8 11:29
 */
@RestController
@RequestMapping("/resume")
public class ResumeController {

    @Resource
    @Qualifier("resumeServiceImpl")
    private ResumeService resumeService;

    /**
     * 报名
     *
     * @param resume
     * @param firstChoice
     * @param secondChoice
     * @return
     */
    @PostMapping("/apply")
    public UniversalResponseBody apply(Resume resume, String firstChoice, String secondChoice) {
        return resumeService.apply(resume, firstChoice, secondChoice);
    }


    /**
     * 查看简历
     *
     * @param organizationId
     * @param departmentName
     * @param userTel
     * @return
     */
    @GetMapping("/view")
    public UniversalResponseBody<Resume> ViewResume(Integer organizationId, String departmentName, String userTel) {
        return null;
    }

    /**
     * 简历打分
     *
     * @param resumeScorePO
     * @return
     */
    @PostMapping("/score")
    public UniversalResponseBody ResumeScore(ResumeScorePO resumeScorePO) {
        return null;
    }
}
