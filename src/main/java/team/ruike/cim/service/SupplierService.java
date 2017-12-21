package team.ruike.cim.service;

/**
 * Created by Administrator on 2017/12/19.
 */

import team.ruike.cim.pojo.MaterielTypeLevelB;
import team.ruike.cim.pojo.Supplier;
import team.ruike.cim.util.Pager;

import java.util.List;

/**
 * 供应商管理业务接口
 * @author 王傲祥
 * @version 1.0
 */
public interface SupplierService {
    /**
     * 查询所有供应商信息
     * @param supplier 供应商
     * @param pager 分页辅助类
     */
    void getSupplier(Supplier supplier, Pager<Supplier>pager);

    /**
     * 删除供应商
     * @param supplierId 供应商id
     * @return
     */
    int delectSupplier(int supplierId);

    /**
     * 查询所有二级类型
     * @param materielTypeLevelB 二级类型
     * @return 二级类型集合
     */
    List<MaterielTypeLevelB> getMaterielTypeLevelB(MaterielTypeLevelB materielTypeLevelB);

    /**
     * 添加供应商
     * @param supplier 供应商
     * @return
     */
    int addSupplier(Supplier supplier);
}