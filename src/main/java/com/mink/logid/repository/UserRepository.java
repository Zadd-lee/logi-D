package com.mink.logid.repository;

import com.mink.logid.common.constants.UserError;
import com.mink.logid.common.exception.CustomException;
import com.mink.logid.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    default User findByIdOrElseThrow(Long id) {
        return findById(id).orElseThrow(() -> new CustomException(UserError.USER_NOT_FOUND));
    }
}
