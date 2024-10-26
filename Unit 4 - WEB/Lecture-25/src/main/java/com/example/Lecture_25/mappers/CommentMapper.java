package com.example.Lecture_25.mappers;

import com.example.Lecture_25.model.comment.CommentEntity;
import com.example.Lecture_25.model.comment.CommentRequest;
import com.example.Lecture_25.model.comment.CommentResponse;

public class CommentMapper {

    public static CommentEntity mapResponseToEntity(CommentRequest request) {
        CommentEntity commentEntity = new CommentEntity();
        commentEntity.setText(request.getText());
        return commentEntity;
    }


    public static CommentResponse mapEntityToResponse(CommentEntity entity) {
        CommentResponse commentResponse = new CommentResponse();
        commentResponse.setId(entity.getId());
        commentResponse.setText(entity.getText());
        commentResponse.setProductName(entity.getProductEntity().getName());
        return commentResponse;
    }
}
