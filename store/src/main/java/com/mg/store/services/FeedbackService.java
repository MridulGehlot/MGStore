package com.mg.store.services;    
import com.mg.store.dl.*;
import com.mg.store.dl.pojo.*;
import com.mg.store.beans.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;
import java.sql.Date;
import java.time.LocalDate;

@Controller
public class FeedbackService {
    @Autowired
    private FeedbackRepository feedbackRepository;

    @ResponseBody
    @GetMapping("/addFeedback")
    public FeedbackBean addFeedback(FeedbackBean feedbackBean) {
        Feedback feedback = new Feedback(Date.valueOf(LocalDate.now()), feedbackBean.getCustomerCode(), null, feedbackBean.getComments());
        feedbackRepository.save(feedback);
        feedbackBean.setId(feedback.getId());
        return feedbackBean;
    }
    
    
}
