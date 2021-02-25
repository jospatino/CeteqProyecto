package com.school.service;

import java.util.List;

import com.school.bean.KardexBean;

public interface KardexService {
	public Integer saveKardex(KardexBean kardexBean);
	public List<KardexBean> findKardex();
	public KardexBean findIdKardex(Integer idKardex);
	public Boolean updateKardex(KardexBean kardexBean);
	public Boolean deleteByIdKardex(Integer idKardex);
}
