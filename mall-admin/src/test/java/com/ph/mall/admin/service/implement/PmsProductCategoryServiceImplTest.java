package com.ph.mall.admin.service.implement;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.ph.mall.admin.service.implement.pms.PmsProductCategoryServiceImpl;
import com.ph.mall.common.exception.ItemNotFoundException;
import com.ph.mall.mbg.mapper.pms.PmsProductCategoryMapper;
import com.ph.mall.mbg.model.category.PmsProductCategory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {PmsProductCategoryServiceImpl.class})
@ExtendWith(SpringExtension.class)
class PmsProductCategoryServiceImplTest {
    @MockBean
    private PmsProductCategoryMapper pmsProductCategoryMapper;

    @Autowired
    private PmsProductCategoryServiceImpl pmsProductCategoryServiceImpl;

    /**
     * Method under test: {@link PmsProductCategoryServiceImpl#getItem(Long)}
     */
    @Test
    void testGetItem() {
        PmsProductCategory pmsProductCategory = new PmsProductCategory();
        pmsProductCategory.setDescription("The characteristics of someone or something");
        pmsProductCategory.setIcon("Icon");
        pmsProductCategory.setId(1L);
        pmsProductCategory.setKeywords("Keywords");
        pmsProductCategory.setLevel(1);
        pmsProductCategory.setName("Name");
        pmsProductCategory.setNavStatus(1);
        pmsProductCategory.setParentId(1L);
        pmsProductCategory.setProductCount(3);
        pmsProductCategory.setProductUnit("Product Unit");
        pmsProductCategory.setShowStatus(1);
        pmsProductCategory.setSort(1);
        when(pmsProductCategoryMapper.selectByPrimaryKey(Mockito.<Long>any())).thenReturn(pmsProductCategory);
        assertSame(pmsProductCategory, pmsProductCategoryServiceImpl.getItem(1L));
        verify(pmsProductCategoryMapper).selectByPrimaryKey(Mockito.<Long>any());
    }

    /**
     * Method under test: {@link PmsProductCategoryServiceImpl#getItem(Long)}
     */
    @Test
    void testGetItem2() {
        when(pmsProductCategoryMapper.selectByPrimaryKey(Mockito.<Long>any()))
                .thenThrow(new ItemNotFoundException("An error occurred"));
        assertThrows(ItemNotFoundException.class, () -> pmsProductCategoryServiceImpl.getItem(1L));
        verify(pmsProductCategoryMapper).selectByPrimaryKey(Mockito.<Long>any());
    }
}

