package com.nano.cat.web.ctrl;

import com.nano.cat.web.logic.QuestionnaireLogic;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenzeng
 * @version 0.0.1
 * @date 2025/3/22 12:00
 */
@Tag(name = "问卷接口")
@RestController("/questionnaire")
public class QuestionnaireController {

    @Autowired
    private QuestionnaireLogic questionnaireLogic;

}