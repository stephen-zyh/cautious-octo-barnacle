package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Game {
    public static void main(String[] args){
        List<Player> ps = new ArrayList<Player>();//这句创建了一个ArrayList实现类的对象后把它上溯到了List接口
        ps.add(new Player("Player one"));
        ps.add(new Player("Player two"));
        ps.add(new Player("Player three"));
        int i = 0;
        System.out.println("请玩家出拳（1：剪刀；2：石头；3：布。）");
        while (true){
            if (ps.size() <= 1) //不多于一个玩家时不能进行该游戏。
                break;
            i++;//记录猜拳进行的总次数。
            for (Iterator<Player> it = ps.iterator(); it.hasNext();){
                Player p = it.next();//创建迭代器并进行迭代。
                p.setOut(getRandom());
                System.out.println("第"+i+"局初始化："+p);//默认调用toString
            }
            List<Player> res = judge(ps);//对猜拳结果进行判断，用列表res表示输家。
            if(res != null){
                for (Player p: res){
                    System.out.println("第"+i+"局出局的是："+p);
                }
                ps.removeAll(res);//移除所有输家。
            }
        }
        System.out.println("游戏一共进行了"+i+"局");
        ps.forEach(p -> System.out.println("胜者为："+p));//遍历并找出胜者。
    }
    public static List<Player> judge(List<Player> ps){
        List<Player> res = new ArrayList<>();
        if (ps.size() == 2){
            if (ps.get(0).getOut() == ps.get(1).getOut())
                return null;
            res.add(getLost(ps.get(0), ps.get(1)));//将输家添加到res中。
            return res;
        }
        else{
            if (ps.get(0).getOut() == ps.get(1).getOut() && ps.get(1).getOut() == ps.get(2).getOut())
                return null;//所有人出拳相同，故不能判定胜负。
            if (ps.get(0).getOut() != ps.get(1).getOut() && ps.get(1).getOut() != ps.get(2).getOut()
                    && ps.get(2).getOut() != ps.get(0).getOut())
                return null;//所有人出拳都不同，故不能判断胜负。
            if (ps.get(0).getOut() == ps.get(1).getOut()){
                Player px = getLost(ps.get(0),ps.get(2));
                if (px.getOut() == ps.get(0).getOut()){
                    res.add(ps.get(0));
                    res.add(ps.get(1));
                }else{
                    res.add(ps.get(2));
                }
            }else if (ps.get(0).getOut() == ps.get(2).getOut()){
                Player px = getLost(ps.get(0),ps.get(1));
                if (px.getOut() == ps.get(0).getOut()){
                    res.add(ps.get(0));
                    res.add(ps.get(2));
                }else {
                    res.add(ps.get(1));
                }
            }else{
                Player px = getLost(ps.get(0),ps.get(1));
                if (px.getOut() == ps.get(0).getOut()){
                    res.add(ps.get(0));
                }else{
                    res.add(ps.get(1));
                    res.add(ps.get(2));
                }
            }
        }
        return res;
    }
    public static Player getLost(Player p1, Player p2){
        if (Math.abs(p1.getOut() - p2.getOut()) == 1){
            if (p1.getOut() > p2.getOut())
                return p2;
            else
                return p1;
        }
        else{//随机数差值不为1，即一位玩家出剪刀（1），另一位玩家出布（3）。
            if (p1.getOut() > p2.getOut())
                return p1;
            else
                return p2;
        }
    }
    public static int getRandom(){
        int m = (int)((Math.random()*3)+1);//生成随机数作为玩家的猜拳结果。
        return m;
    }
}