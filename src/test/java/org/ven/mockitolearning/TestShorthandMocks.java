package org.ven.mockitolearning;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.ven.mockitilearning.model.api.IBusinessInterface;
import org.ven.mockitilearning.model.api.Pojo;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TestShorthandMocks {

    @Mock
    IBusinessInterface ibi;

    @Test
    public void testShorthandStyle() throws Exception
    {
        when(ibi.doBusinessStuff(any(Pojo.class), anyInt()) )
                .thenReturn(10);
        Assert.assertEquals(10,
                ibi.doBusinessStuff(null, 100));
        ibi.doStuff();
        verify(ibi, times(1)).doBusinessStuff(null, 100);

    }

}
