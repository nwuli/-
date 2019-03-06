#coding:utf-8
from idaapi import *
danger_funcs = ["IsProcessorFeaturePresent"]  # ��ҪѰ�ҵĺ�����
for func in danger_funcs:
    addr = LocByName( func ) 
    if addr != BADADDR:
       #�ҵ��������õĵ�ַ
        cross_refs = CodeRefsTo( addr, 0 )
        print "Cross References to %s" % func 
        print "-------------------------------"
        for ref in cross_refs: 
            print "%08x" % ref
             # ��������ɫΪ��ɫ
            SetColor( ref, CIC_ITEM, 0x0000ff)