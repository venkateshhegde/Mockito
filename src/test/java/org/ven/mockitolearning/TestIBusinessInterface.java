package org.ven.mockitolearning;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.ven.mockitilearning.model.api.IBusinessInterface;
import org.ven.mockitilearning.model.api.Pojo;


import static org.mockito.Mockito.*;

public class TestIBusinessInterface {
    @Test
    public void testBusinessInterface() throws Exception
    {

            IBusinessInterface in = mock(IBusinessInterface.class);
            when(in.doBusinessStuff(any(Pojo.class), anyInt())).
                    thenReturn(10).thenReturn(20).thenReturn(30);
            Assert.assertEquals(in.doBusinessStuff(null, 100), 10);
            Assert.assertEquals(in.doBusinessStuff(null, 100), 20);
            Assert.assertEquals(in.doBusinessStuff(null, 100), 30);
            Assert.assertEquals(in.doBusinessStuff(null, 100), 30);
            verify(in, times(4)).doBusinessStuff(null, 100);
            verify(in, atLeast(4)).doBusinessStuff(null, 100);
            verify(in, atLeastOnce()).doBusinessStuff(null, 100);



    }

    @Test (expected = Exception.class)
    public void testBusinessInterfaceException() throws Exception
    {

        IBusinessInterface in = mock(IBusinessInterface.class);
        when(in.doBusinessStuff(any(Pojo.class), anyInt())).
                thenThrow(new Exception ("Hello World E !"));
        in.doBusinessStuff(null, 10);


    }

}
