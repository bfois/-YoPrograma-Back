/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bef.api.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DtoEducacion {
     @NotBlank
    private String nombreEdu;
    @NotBlank
    private String descripcionEdu;
    @NotBlank
    private int initDate;
    @NotBlank
    private int finishDate;
    public DtoEducacion() {
    }

    public DtoEducacion(String nombreEdu, String descripcionEdu, int initDate, int finishDate) {
        this.nombreEdu = nombreEdu;
        this.descripcionEdu = descripcionEdu;
        this.initDate = initDate;
        this.finishDate = finishDate;
    }
}
