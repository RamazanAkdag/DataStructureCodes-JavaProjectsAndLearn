package org.example.igniteDeneme;


public class App
{
    public static void main( String[] args )
    {
        IgniteConfiguration igniteCfg = new IgniteConfiguration();
//setting a work directory
        igniteCfg.setWorkDirectory("/path/to/work/directory");

//defining a partitioned cache
        CacheConfiguration cacheCfg = new CacheConfiguration("myCache");
        cacheCfg.setCacheMode(CacheMode.PARTITIONED);

        igniteCfg.setCacheConfiguration(cacheCfg);

    }
}
