package com.mg.store.beans;

public class FeedbackBean {
    private Long id;
    private Long customerCode;
    private String comments;
    private Integer rating;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(Long customerCode) {
        this.customerCode = customerCode;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
