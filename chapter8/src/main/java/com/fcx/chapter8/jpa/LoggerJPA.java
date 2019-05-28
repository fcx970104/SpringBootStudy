package com.fcx.chapter8.jpa;

import com.fcx.chapter8.entity.LoggerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: fancaixing
 * @Date: 2019/5/26 19:17
 * @Version 1.0
 */
public interface LoggerJPA
        extends JpaRepository<LoggerEntity,Long>
{

}