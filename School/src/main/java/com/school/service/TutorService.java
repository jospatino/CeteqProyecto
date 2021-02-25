package com.school.service;

import java.util.List;

import com.school.bean.TutorBean;

public interface TutorService {
   public Integer saveTutor(TutorBean tutorBean);
   public List<TutorBean> findTutor();
   public TutorBean findIdTutor(Integer idTutor);
   public Boolean updateTutor(TutorBean tutorBean);
   public Boolean deleteByIdTutor(Integer idTutor);
   
}
