/**
 * 
 * 
 * path = "/home/", => "/home"
path = "/a/./b/../../c/", => "/c"

边界情况:

    你是否考虑了 路径 = "/../" 的情况？
    在这种情况下，你需返回 "/" 。
    此外，路径中也可能包含多个斜杠 '/' ，如 "/home//foo/" 。
    在这种情况下，你可忽略多余的斜杠，返回 "/home/foo" 。

 */
/**
 * @author Administrator
 *
 */
package me_71;