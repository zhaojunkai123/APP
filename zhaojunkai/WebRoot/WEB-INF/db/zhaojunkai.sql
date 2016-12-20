select * from (select row_number() over(order by e.sal desc)rn,e.ename,e.job,e.sal,d.dname,d.loc from emp e,dept d  where e.deptno=d.deptno ) where rn>5 and  rn<=10
select count(ename) from  (select row_number() over(order by e.sal desc)rn,e.ename,e.job,e.sal,d.dname,d.loc from emp e,dept d  where e.deptno=d.deptno )
