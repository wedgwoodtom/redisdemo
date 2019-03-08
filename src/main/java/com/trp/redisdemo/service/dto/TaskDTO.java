package com.trp.redisdemo.service.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class TaskDTO implements Serializable
{

    public long calculatedResult;

    public void setCalculatedResult(long calculatedResult)
    {
        this.calculatedResult = calculatedResult;
    }
}