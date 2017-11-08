package com.vinod.genrics;

interface Cache <K,V>{
    public V get();
    public V put(K key, V value);
}
