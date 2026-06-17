package com.mojang.datafixers;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.util.Function10;
import com.mojang.datafixers.util.Function11;
import com.mojang.datafixers.util.Function12;
import com.mojang.datafixers.util.Function13;
import com.mojang.datafixers.util.Function14;
import com.mojang.datafixers.util.Function15;
import com.mojang.datafixers.util.Function16;
import com.mojang.datafixers.util.Function3;
import com.mojang.datafixers.util.Function4;
import com.mojang.datafixers.util.Function5;
import com.mojang.datafixers.util.Function6;
import com.mojang.datafixers.util.Function7;
import com.mojang.datafixers.util.Function8;
import com.mojang.datafixers.util.Function9;

import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;

public interface Products {
    final class P1<F extends K1, T1> {

        public final App<F, T1> t1;

        public P1(final App<F, T1> t1) {
            this.t1 = t1;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof P1)) return false;
            return Objects.equals(t1, ((P1<?, ?>) o).t1);
        }

        @Override
        public int hashCode() {
            return Objects.hash(t1);
        }

        @Override
        public String toString() {
            return "P1[t1=" + t1
                    + "]";
        }

        public <T2> P2<F, T1, T2> and(final App<F, T2> t2) {
            return new P2<>(t1, t2);
        }

        public <T2, T3> P3<F, T1, T2, T3> and(final P2<F, T2, T3> p) {
            return new P3<>(t1, p.t1, p.t2);
        }

        public <T2, T3, T4> P4<F, T1, T2, T3, T4> and(final P3<F, T2, T3, T4> p) {
            return new P4<>(t1, p.t1, p.t2, p.t3);
        }

        public <T2, T3, T4, T5> P5<F, T1, T2, T3, T4, T5> and(final P4<F, T2, T3, T4, T5> p) {
            return new P5<>(t1, p.t1, p.t2, p.t3, p.t4);
        }

        public <T2, T3, T4, T5, T6> P6<F, T1, T2, T3, T4, T5, T6> and(final P5<F, T2, T3, T4, T5, T6> p) {
            return new P6<>(t1, p.t1, p.t2, p.t3, p.t4, p.t5);
        }

        public <T2, T3, T4, T5, T6, T7> P7<F, T1, T2, T3, T4, T5, T6, T7> and(final P6<F, T2, T3, T4, T5, T6, T7> p) {
            return new P7<>(t1, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6);
        }

        public <T2, T3, T4, T5, T6, T7, T8> P8<F, T1, T2, T3, T4, T5, T6, T7, T8> and(final P7<F, T2, T3, T4, T5, T6, T7, T8> p) {
            return new P8<>(t1, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7);
        }

        public <T2, T3, T4, T5, T6, T7, T8, T9> P9<F, T1, T2, T3, T4, T5, T6, T7, T8, T9> and(final P8<F, T2, T3, T4, T5, T6, T7, T8, T9> p) {
            return new P9<>(t1, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8);
        }

        public <T2, T3, T4, T5, T6, T7, T8, T9, T10> P10<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> and(final P9<F, T2, T3, T4, T5, T6, T7, T8, T9, T10> p) {
            return new P10<>(t1, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8, p.t9);
        }

        public <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> and(final P10<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> p) {
            return new P11<>(t1, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8, p.t9, p.t10);
        }

        public <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final P11<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> p) {
            return new P12<>(t1, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8, p.t9, p.t10, p.t11);
        }

        public <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final P12<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> p) {
            return new P13<>(t1, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8, p.t9, p.t10, p.t11, p.t12);
        }

        public <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final P13<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> p) {
            return new P14<>(t1, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8, p.t9, p.t10, p.t11, p.t12, p.t13);
        }

        public <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final P14<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> p) {
            return new P15<>(t1, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8, p.t9, p.t10, p.t11, p.t12, p.t13, p.t14);
        }

        public <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final P15<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> p) {
            return new P16<>(t1, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8, p.t9, p.t10, p.t11, p.t12, p.t13, p.t14, p.t15);
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function<T1, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function<T1, R>> function) {
            return instance.ap(function, t1);
        }
    }

    static <T1, T2> P2<IdF.Mu, T1, T2> of(final T1 t1, final T2 t2) {
        return new P2<>(IdF.create(t1), IdF.create(t2));
    }

    final class P2<F extends K1, T1, T2> {

        public final App<F, T1> t1;
        public final App<F, T2> t2;

        public P2(final App<F, T1> t1, final App<F, T2> t2) {
            this.t1 = t1;
            this.t2 = t2;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof P2)) return false;
            final P2<?, ?, ?> that = (P2<?, ?, ?>) o;
            return Objects.equals(t1, that.t1)
                    && Objects.equals(t2, that.t2);
        }

        @Override
        public int hashCode() {
            return Objects.hash(t1, t2);
        }

        @Override
        public String toString() {
            return "P2[t1=" + t1
                    + ", t2=" + t2
                    + "]";
        }

        public <T3> P3<F, T1, T2, T3> and(final App<F, T3> t3) {
            return new P3<>(t1, t2, t3);
        }

        public <T3, T4> P4<F, T1, T2, T3, T4> and(final P2<F, T3, T4> p) {
            return new P4<>(t1, t2, p.t1, p.t2);
        }

        public <T3, T4, T5> P5<F, T1, T2, T3, T4, T5> and(final P3<F, T3, T4, T5> p) {
            return new P5<>(t1, t2, p.t1, p.t2, p.t3);
        }

        public <T3, T4, T5, T6> P6<F, T1, T2, T3, T4, T5, T6> and(final P4<F, T3, T4, T5, T6> p) {
            return new P6<>(t1, t2, p.t1, p.t2, p.t3, p.t4);
        }

        public <T3, T4, T5, T6, T7> P7<F, T1, T2, T3, T4, T5, T6, T7> and(final P5<F, T3, T4, T5, T6, T7> p) {
            return new P7<>(t1, t2, p.t1, p.t2, p.t3, p.t4, p.t5);
        }

        public <T3, T4, T5, T6, T7, T8> P8<F, T1, T2, T3, T4, T5, T6, T7, T8> and(final P6<F, T3, T4, T5, T6, T7, T8> p) {
            return new P8<>(t1, t2, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6);
        }

        public <T3, T4, T5, T6, T7, T8, T9> P9<F, T1, T2, T3, T4, T5, T6, T7, T8, T9> and(final P7<F, T3, T4, T5, T6, T7, T8, T9> p) {
            return new P9<>(t1, t2, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7);
        }

        public <T3, T4, T5, T6, T7, T8, T9, T10> P10<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> and(final P8<F, T3, T4, T5, T6, T7, T8, T9, T10> p) {
            return new P10<>(t1, t2, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8);
        }

        public <T3, T4, T5, T6, T7, T8, T9, T10, T11> P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> and(final P9<F, T3, T4, T5, T6, T7, T8, T9, T10, T11> p) {
            return new P11<>(t1, t2, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8, p.t9);
        }

        public <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final P10<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> p) {
            return new P12<>(t1, t2, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8, p.t9, p.t10);
        }

        public <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final P11<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> p) {
            return new P13<>(t1, t2, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8, p.t9, p.t10, p.t11);
        }

        public <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final P12<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> p) {
            return new P14<>(t1, t2, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8, p.t9, p.t10, p.t11, p.t12);
        }

        public <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final P13<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> p) {
            return new P15<>(t1, t2, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8, p.t9, p.t10, p.t11, p.t12, p.t13);
        }

        public <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final P14<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> p) {
            return new P16<>(t1, t2, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8, p.t9, p.t10, p.t11, p.t12, p.t13, p.t14);
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final BiFunction<T1, T2, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, BiFunction<T1, T2, R>> function) {
            return instance.ap2(function, t1, t2);
        }
    }

    final class P3<F extends K1, T1, T2, T3> {

        public final App<F, T1> t1;
        public final App<F, T2> t2;
        public final App<F, T3> t3;

        public P3(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof P3)) return false;
            final P3<?, ?, ?, ?> that = (P3<?, ?, ?, ?>) o;
            return Objects.equals(t1, that.t1)
                    && Objects.equals(t2, that.t2)
                    && Objects.equals(t3, that.t3);
        }

        @Override
        public int hashCode() {
            return Objects.hash(t1, t2, t3);
        }

        @Override
        public String toString() {
            return "P3[t1=" + t1
                    + ", t2=" + t2
                    + ", t3=" + t3
                    + "]";
        }

        public <T4> P4<F, T1, T2, T3, T4> and(final App<F, T4> t4) {
            return new P4<>(t1, t2, t3, t4);
        }

        public <T4, T5> P5<F, T1, T2, T3, T4, T5> and(final P2<F, T4, T5> p) {
            return new P5<>(t1, t2, t3, p.t1, p.t2);
        }

        public <T4, T5, T6> P6<F, T1, T2, T3, T4, T5, T6> and(final P3<F, T4, T5, T6> p) {
            return new P6<>(t1, t2, t3, p.t1, p.t2, p.t3);
        }

        public <T4, T5, T6, T7> P7<F, T1, T2, T3, T4, T5, T6, T7> and(final P4<F, T4, T5, T6, T7> p) {
            return new P7<>(t1, t2, t3, p.t1, p.t2, p.t3, p.t4);
        }

        public <T4, T5, T6, T7, T8> P8<F, T1, T2, T3, T4, T5, T6, T7, T8> and(final P5<F, T4, T5, T6, T7, T8> p) {
            return new P8<>(t1, t2, t3, p.t1, p.t2, p.t3, p.t4, p.t5);
        }

        public <T4, T5, T6, T7, T8, T9> P9<F, T1, T2, T3, T4, T5, T6, T7, T8, T9> and(final P6<F, T4, T5, T6, T7, T8, T9> p) {
            return new P9<>(t1, t2, t3, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6);
        }

        public <T4, T5, T6, T7, T8, T9, T10> P10<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> and(final P7<F, T4, T5, T6, T7, T8, T9, T10> p) {
            return new P10<>(t1, t2, t3, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7);
        }

        public <T4, T5, T6, T7, T8, T9, T10, T11> P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> and(final P8<F, T4, T5, T6, T7, T8, T9, T10, T11> p) {
            return new P11<>(t1, t2, t3, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8);
        }

        public <T4, T5, T6, T7, T8, T9, T10, T11, T12> P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final P9<F, T4, T5, T6, T7, T8, T9, T10, T11, T12> p) {
            return new P12<>(t1, t2, t3, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8, p.t9);
        }

        public <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final P10<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> p) {
            return new P13<>(t1, t2, t3, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8, p.t9, p.t10);
        }

        public <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final P11<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> p) {
            return new P14<>(t1, t2, t3, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8, p.t9, p.t10, p.t11);
        }

        public <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final P12<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> p) {
            return new P15<>(t1, t2, t3, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8, p.t9, p.t10, p.t11, p.t12);
        }

        public <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final P13<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> p) {
            return new P16<>(t1, t2, t3, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8, p.t9, p.t10, p.t11, p.t12, p.t13);
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function3<T1, T2, T3, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function3<T1, T2, T3, R>> function) {
            return instance.ap3(function, t1, t2, t3);
        }
    }

    final class P4<F extends K1, T1, T2, T3, T4> {

        public final App<F, T1> t1;
        public final App<F, T2> t2;
        public final App<F, T3> t3;
        public final App<F, T4> t4;

        public P4(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof P4)) return false;
            final P4<?, ?, ?, ?, ?> that = (P4<?, ?, ?, ?, ?>) o;
            return Objects.equals(t1, that.t1)
                    && Objects.equals(t2, that.t2)
                    && Objects.equals(t3, that.t3)
                    && Objects.equals(t4, that.t4);
        }

        @Override
        public int hashCode() {
            return Objects.hash(t1, t2, t3, t4);
        }

        @Override
        public String toString() {
            return "P4[t1=" + t1
                    + ", t2=" + t2
                    + ", t3=" + t3
                    + ", t4=" + t4
                    + "]";
        }

        public <T5> P5<F, T1, T2, T3, T4, T5> and(final App<F, T5> t5) {
            return new P5<>(t1, t2, t3, t4, t5);
        }

        public <T5, T6> P6<F, T1, T2, T3, T4, T5, T6> and(final P2<F, T5, T6> p) {
            return new P6<>(t1, t2, t3, t4, p.t1, p.t2);
        }

        public <T5, T6, T7> P7<F, T1, T2, T3, T4, T5, T6, T7> and(final P3<F, T5, T6, T7> p) {
            return new P7<>(t1, t2, t3, t4, p.t1, p.t2, p.t3);
        }

        public <T5, T6, T7, T8> P8<F, T1, T2, T3, T4, T5, T6, T7, T8> and(final P4<F, T5, T6, T7, T8> p) {
            return new P8<>(t1, t2, t3, t4, p.t1, p.t2, p.t3, p.t4);
        }

        public <T5, T6, T7, T8, T9> P9<F, T1, T2, T3, T4, T5, T6, T7, T8, T9> and(final P5<F, T5, T6, T7, T8, T9> p) {
            return new P9<>(t1, t2, t3, t4, p.t1, p.t2, p.t3, p.t4, p.t5);
        }

        public <T5, T6, T7, T8, T9, T10> P10<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> and(final P6<F, T5, T6, T7, T8, T9, T10> p) {
            return new P10<>(t1, t2, t3, t4, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6);
        }

        public <T5, T6, T7, T8, T9, T10, T11> P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> and(final P7<F, T5, T6, T7, T8, T9, T10, T11> p) {
            return new P11<>(t1, t2, t3, t4, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7);
        }

        public <T5, T6, T7, T8, T9, T10, T11, T12> P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final P8<F, T5, T6, T7, T8, T9, T10, T11, T12> p) {
            return new P12<>(t1, t2, t3, t4, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8);
        }

        public <T5, T6, T7, T8, T9, T10, T11, T12, T13> P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final P9<F, T5, T6, T7, T8, T9, T10, T11, T12, T13> p) {
            return new P13<>(t1, t2, t3, t4, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8, p.t9);
        }

        public <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final P10<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> p) {
            return new P14<>(t1, t2, t3, t4, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8, p.t9, p.t10);
        }

        public <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final P11<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> p) {
            return new P15<>(t1, t2, t3, t4, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8, p.t9, p.t10, p.t11);
        }

        public <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final P12<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> p) {
            return new P16<>(t1, t2, t3, t4, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8, p.t9, p.t10, p.t11, p.t12);
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function4<T1, T2, T3, T4, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function4<T1, T2, T3, T4, R>> function) {
            return instance.ap4(function, t1, t2, t3, t4);
        }
    }

    final class P5<F extends K1, T1, T2, T3, T4, T5> {

        public final App<F, T1> t1;
        public final App<F, T2> t2;
        public final App<F, T3> t3;
        public final App<F, T4> t4;
        public final App<F, T5> t5;

        public P5(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof P5)) return false;
            final P5<?, ?, ?, ?, ?, ?> that = (P5<?, ?, ?, ?, ?, ?>) o;
            return Objects.equals(t1, that.t1)
                    && Objects.equals(t2, that.t2)
                    && Objects.equals(t3, that.t3)
                    && Objects.equals(t4, that.t4)
                    && Objects.equals(t5, that.t5);
        }

        @Override
        public int hashCode() {
            return Objects.hash(t1, t2, t3, t4, t5);
        }

        @Override
        public String toString() {
            return "P5[t1=" + t1
                    + ", t2=" + t2
                    + ", t3=" + t3
                    + ", t4=" + t4
                    + ", t5=" + t5
                    + "]";
        }

        public <T6> P6<F, T1, T2, T3, T4, T5, T6> and(final App<F, T6> t6) {
            return new P6<>(t1, t2, t3, t4, t5, t6);
        }

        public <T6, T7> P7<F, T1, T2, T3, T4, T5, T6, T7> and(final P2<F, T6, T7> p) {
            return new P7<>(t1, t2, t3, t4, t5, p.t1, p.t2);
        }

        public <T6, T7, T8> P8<F, T1, T2, T3, T4, T5, T6, T7, T8> and(final P3<F, T6, T7, T8> p) {
            return new P8<>(t1, t2, t3, t4, t5, p.t1, p.t2, p.t3);
        }

        public <T6, T7, T8, T9> P9<F, T1, T2, T3, T4, T5, T6, T7, T8, T9> and(final P4<F, T6, T7, T8, T9> p) {
            return new P9<>(t1, t2, t3, t4, t5, p.t1, p.t2, p.t3, p.t4);
        }

        public <T6, T7, T8, T9, T10> P10<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> and(final P5<F, T6, T7, T8, T9, T10> p) {
            return new P10<>(t1, t2, t3, t4, t5, p.t1, p.t2, p.t3, p.t4, p.t5);
        }

        public <T6, T7, T8, T9, T10, T11> P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> and(final P6<F, T6, T7, T8, T9, T10, T11> p) {
            return new P11<>(t1, t2, t3, t4, t5, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6);
        }

        public <T6, T7, T8, T9, T10, T11, T12> P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final P7<F, T6, T7, T8, T9, T10, T11, T12> p) {
            return new P12<>(t1, t2, t3, t4, t5, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7);
        }

        public <T6, T7, T8, T9, T10, T11, T12, T13> P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final P8<F, T6, T7, T8, T9, T10, T11, T12, T13> p) {
            return new P13<>(t1, t2, t3, t4, t5, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8);
        }

        public <T6, T7, T8, T9, T10, T11, T12, T13, T14> P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final P9<F, T6, T7, T8, T9, T10, T11, T12, T13, T14> p) {
            return new P14<>(t1, t2, t3, t4, t5, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8, p.t9);
        }

        public <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final P10<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> p) {
            return new P15<>(t1, t2, t3, t4, t5, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8, p.t9, p.t10);
        }

        public <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final P11<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> p) {
            return new P16<>(t1, t2, t3, t4, t5, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8, p.t9, p.t10, p.t11);
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function5<T1, T2, T3, T4, T5, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function5<T1, T2, T3, T4, T5, R>> function) {
            return instance.ap5(function, t1, t2, t3, t4, t5);
        }
    }

    final class P6<F extends K1, T1, T2, T3, T4, T5, T6> {

        public final App<F, T1> t1;
        public final App<F, T2> t2;
        public final App<F, T3> t3;
        public final App<F, T4> t4;
        public final App<F, T5> t5;
        public final App<F, T6> t6;

        public P6(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof P6)) return false;
            final P6<?, ?, ?, ?, ?, ?, ?> that = (P6<?, ?, ?, ?, ?, ?, ?>) o;
            return Objects.equals(t1, that.t1)
                    && Objects.equals(t2, that.t2)
                    && Objects.equals(t3, that.t3)
                    && Objects.equals(t4, that.t4)
                    && Objects.equals(t5, that.t5)
                    && Objects.equals(t6, that.t6);
        }

        @Override
        public int hashCode() {
            return Objects.hash(t1, t2, t3, t4, t5, t6);
        }

        @Override
        public String toString() {
            return "P6[t1=" + t1
                    + ", t2=" + t2
                    + ", t3=" + t3
                    + ", t4=" + t4
                    + ", t5=" + t5
                    + ", t6=" + t6
                    + "]";
        }

        public <T7> P7<F, T1, T2, T3, T4, T5, T6, T7> and(final App<F, T7> t7) {
            return new P7<>(t1, t2, t3, t4, t5, t6, t7);
        }

        public <T7, T8> P8<F, T1, T2, T3, T4, T5, T6, T7, T8> and(final P2<F, T7, T8> p) {
            return new P8<>(t1, t2, t3, t4, t5, t6, p.t1, p.t2);
        }

        public <T7, T8, T9> P9<F, T1, T2, T3, T4, T5, T6, T7, T8, T9> and(final P3<F, T7, T8, T9> p) {
            return new P9<>(t1, t2, t3, t4, t5, t6, p.t1, p.t2, p.t3);
        }

        public <T7, T8, T9, T10> P10<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> and(final P4<F, T7, T8, T9, T10> p) {
            return new P10<>(t1, t2, t3, t4, t5, t6, p.t1, p.t2, p.t3, p.t4);
        }

        public <T7, T8, T9, T10, T11> P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> and(final P5<F, T7, T8, T9, T10, T11> p) {
            return new P11<>(t1, t2, t3, t4, t5, t6, p.t1, p.t2, p.t3, p.t4, p.t5);
        }

        public <T7, T8, T9, T10, T11, T12> P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final P6<F, T7, T8, T9, T10, T11, T12> p) {
            return new P12<>(t1, t2, t3, t4, t5, t6, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6);
        }

        public <T7, T8, T9, T10, T11, T12, T13> P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final P7<F, T7, T8, T9, T10, T11, T12, T13> p) {
            return new P13<>(t1, t2, t3, t4, t5, t6, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7);
        }

        public <T7, T8, T9, T10, T11, T12, T13, T14> P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final P8<F, T7, T8, T9, T10, T11, T12, T13, T14> p) {
            return new P14<>(t1, t2, t3, t4, t5, t6, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8);
        }

        public <T7, T8, T9, T10, T11, T12, T13, T14, T15> P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final P9<F, T7, T8, T9, T10, T11, T12, T13, T14, T15> p) {
            return new P15<>(t1, t2, t3, t4, t5, t6, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8, p.t9);
        }

        public <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final P10<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> p) {
            return new P16<>(t1, t2, t3, t4, t5, t6, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8, p.t9, p.t10);
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function6<T1, T2, T3, T4, T5, T6, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function6<T1, T2, T3, T4, T5, T6, R>> function) {
            return instance.ap6(function, t1, t2, t3, t4, t5, t6);
        }
    }

    final class P7<F extends K1, T1, T2, T3, T4, T5, T6, T7> {

        public final App<F, T1> t1;
        public final App<F, T2> t2;
        public final App<F, T3> t3;
        public final App<F, T4> t4;
        public final App<F, T5> t5;
        public final App<F, T6> t6;
        public final App<F, T7> t7;

        public P7(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof P7)) return false;
            final P7<?, ?, ?, ?, ?, ?, ?, ?> that = (P7<?, ?, ?, ?, ?, ?, ?, ?>) o;
            return Objects.equals(t1, that.t1)
                    && Objects.equals(t2, that.t2)
                    && Objects.equals(t3, that.t3)
                    && Objects.equals(t4, that.t4)
                    && Objects.equals(t5, that.t5)
                    && Objects.equals(t6, that.t6)
                    && Objects.equals(t7, that.t7);
        }

        @Override
        public int hashCode() {
            return Objects.hash(t1, t2, t3, t4, t5, t6, t7);
        }

        @Override
        public String toString() {
            return "P7[t1=" + t1
                    + ", t2=" + t2
                    + ", t3=" + t3
                    + ", t4=" + t4
                    + ", t5=" + t5
                    + ", t6=" + t6
                    + ", t7=" + t7
                    + "]";
        }

        public <T8> P8<F, T1, T2, T3, T4, T5, T6, T7, T8> and(final App<F, T8> t8) {
            return new P8<>(t1, t2, t3, t4, t5, t6, t7, t8);
        }

        public <T8, T9> P9<F, T1, T2, T3, T4, T5, T6, T7, T8, T9> and(final P2<F, T8, T9> p) {
            return new P9<>(t1, t2, t3, t4, t5, t6, t7, p.t1, p.t2);
        }

        public <T8, T9, T10> P10<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> and(final P3<F, T8, T9, T10> p) {
            return new P10<>(t1, t2, t3, t4, t5, t6, t7, p.t1, p.t2, p.t3);
        }

        public <T8, T9, T10, T11> P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> and(final P4<F, T8, T9, T10, T11> p) {
            return new P11<>(t1, t2, t3, t4, t5, t6, t7, p.t1, p.t2, p.t3, p.t4);
        }

        public <T8, T9, T10, T11, T12> P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final P5<F, T8, T9, T10, T11, T12> p) {
            return new P12<>(t1, t2, t3, t4, t5, t6, t7, p.t1, p.t2, p.t3, p.t4, p.t5);
        }

        public <T8, T9, T10, T11, T12, T13> P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final P6<F, T8, T9, T10, T11, T12, T13> p) {
            return new P13<>(t1, t2, t3, t4, t5, t6, t7, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6);
        }

        public <T8, T9, T10, T11, T12, T13, T14> P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final P7<F, T8, T9, T10, T11, T12, T13, T14> p) {
            return new P14<>(t1, t2, t3, t4, t5, t6, t7, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7);
        }

        public <T8, T9, T10, T11, T12, T13, T14, T15> P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final P8<F, T8, T9, T10, T11, T12, T13, T14, T15> p) {
            return new P15<>(t1, t2, t3, t4, t5, t6, t7, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8);
        }

        public <T8, T9, T10, T11, T12, T13, T14, T15, T16> P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final P9<F, T8, T9, T10, T11, T12, T13, T14, T15, T16> p) {
            return new P16<>(t1, t2, t3, t4, t5, t6, t7, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8, p.t9);
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function7<T1, T2, T3, T4, T5, T6, T7, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function7<T1, T2, T3, T4, T5, T6, T7, R>> function) {
            return instance.ap7(function, t1, t2, t3, t4, t5, t6, t7);
        }
    }

    final class P8<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8> {

        public final App<F, T1> t1;
        public final App<F, T2> t2;
        public final App<F, T3> t3;
        public final App<F, T4> t4;
        public final App<F, T5> t5;
        public final App<F, T6> t6;
        public final App<F, T7> t7;
        public final App<F, T8> t8;

        public P8(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof P8)) return false;
            final P8<?, ?, ?, ?, ?, ?, ?, ?, ?> that = (P8<?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
            return Objects.equals(t1, that.t1)
                    && Objects.equals(t2, that.t2)
                    && Objects.equals(t3, that.t3)
                    && Objects.equals(t4, that.t4)
                    && Objects.equals(t5, that.t5)
                    && Objects.equals(t6, that.t6)
                    && Objects.equals(t7, that.t7)
                    && Objects.equals(t8, that.t8);
        }

        @Override
        public int hashCode() {
            return Objects.hash(t1, t2, t3, t4, t5, t6, t7, t8);
        }

        @Override
        public String toString() {
            return "P8[t1=" + t1
                    + ", t2=" + t2
                    + ", t3=" + t3
                    + ", t4=" + t4
                    + ", t5=" + t5
                    + ", t6=" + t6
                    + ", t7=" + t7
                    + ", t8=" + t8
                    + "]";
        }

        public <T9> P9<F, T1, T2, T3, T4, T5, T6, T7, T8, T9> and(final App<F, T9> t9) {
            return new P9<>(t1, t2, t3, t4, t5, t6, t7, t8, t9);
        }

        public <T9, T10> P10<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> and(final P2<F, T9, T10> p) {
            return new P10<>(t1, t2, t3, t4, t5, t6, t7, t8, p.t1, p.t2);
        }

        public <T9, T10, T11> P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> and(final P3<F, T9, T10, T11> p) {
            return new P11<>(t1, t2, t3, t4, t5, t6, t7, t8, p.t1, p.t2, p.t3);
        }

        public <T9, T10, T11, T12> P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final P4<F, T9, T10, T11, T12> p) {
            return new P12<>(t1, t2, t3, t4, t5, t6, t7, t8, p.t1, p.t2, p.t3, p.t4);
        }

        public <T9, T10, T11, T12, T13> P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final P5<F, T9, T10, T11, T12, T13> p) {
            return new P13<>(t1, t2, t3, t4, t5, t6, t7, t8, p.t1, p.t2, p.t3, p.t4, p.t5);
        }

        public <T9, T10, T11, T12, T13, T14> P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final P6<F, T9, T10, T11, T12, T13, T14> p) {
            return new P14<>(t1, t2, t3, t4, t5, t6, t7, t8, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6);
        }

        public <T9, T10, T11, T12, T13, T14, T15> P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final P7<F, T9, T10, T11, T12, T13, T14, T15> p) {
            return new P15<>(t1, t2, t3, t4, t5, t6, t7, t8, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7);
        }

        public <T9, T10, T11, T12, T13, T14, T15, T16> P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final P8<F, T9, T10, T11, T12, T13, T14, T15, T16> p) {
            return new P16<>(t1, t2, t3, t4, t5, t6, t7, t8, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7, p.t8);
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function8<T1, T2, T3, T4, T5, T6, T7, T8, R>> function) {
            return instance.ap8(function, t1, t2, t3, t4, t5, t6, t7, t8);
        }
    }

    final class P9<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9> {

        public final App<F, T1> t1;
        public final App<F, T2> t2;
        public final App<F, T3> t3;
        public final App<F, T4> t4;
        public final App<F, T5> t5;
        public final App<F, T6> t6;
        public final App<F, T7> t7;
        public final App<F, T8> t8;
        public final App<F, T9> t9;

        public P9(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof P9)) return false;
            final P9<?, ?, ?, ?, ?, ?, ?, ?, ?, ?> that = (P9<?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
            return Objects.equals(t1, that.t1)
                    && Objects.equals(t2, that.t2)
                    && Objects.equals(t3, that.t3)
                    && Objects.equals(t4, that.t4)
                    && Objects.equals(t5, that.t5)
                    && Objects.equals(t6, that.t6)
                    && Objects.equals(t7, that.t7)
                    && Objects.equals(t8, that.t8)
                    && Objects.equals(t9, that.t9);
        }

        @Override
        public int hashCode() {
            return Objects.hash(t1, t2, t3, t4, t5, t6, t7, t8, t9);
        }

        @Override
        public String toString() {
            return "P9[t1=" + t1
                    + ", t2=" + t2
                    + ", t3=" + t3
                    + ", t4=" + t4
                    + ", t5=" + t5
                    + ", t6=" + t6
                    + ", t7=" + t7
                    + ", t8=" + t8
                    + ", t9=" + t9
                    + "]";
        }

        public <T10> P10<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> and(final App<F, T10> t10) {
            return new P10<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10);
        }

        public <T10, T11> P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> and(final P2<F, T10, T11> p) {
            return new P11<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, p.t1, p.t2);
        }

        public <T10, T11, T12> P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final P3<F, T10, T11, T12> p) {
            return new P12<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, p.t1, p.t2, p.t3);
        }

        public <T10, T11, T12, T13> P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final P4<F, T10, T11, T12, T13> p) {
            return new P13<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, p.t1, p.t2, p.t3, p.t4);
        }

        public <T10, T11, T12, T13, T14> P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final P5<F, T10, T11, T12, T13, T14> p) {
            return new P14<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, p.t1, p.t2, p.t3, p.t4, p.t5);
        }

        public <T10, T11, T12, T13, T14, T15> P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final P6<F, T10, T11, T12, T13, T14, T15> p) {
            return new P15<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6);
        }

        public <T10, T11, T12, T13, T14, T15, T16> P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final P7<F, T10, T11, T12, T13, T14, T15, T16> p) {
            return new P16<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7);
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R>> function) {
            return instance.ap9(function, t1, t2, t3, t4, t5, t6, t7, t8, t9);
        }
    }

    final class P10<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> {

        public final App<F, T1> t1;
        public final App<F, T2> t2;
        public final App<F, T3> t3;
        public final App<F, T4> t4;
        public final App<F, T5> t5;
        public final App<F, T6> t6;
        public final App<F, T7> t7;
        public final App<F, T8> t8;
        public final App<F, T9> t9;
        public final App<F, T10> t10;

        public P10(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
            this.t10 = t10;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof P10)) return false;
            final P10<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> that = (P10<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
            return Objects.equals(t1, that.t1)
                    && Objects.equals(t2, that.t2)
                    && Objects.equals(t3, that.t3)
                    && Objects.equals(t4, that.t4)
                    && Objects.equals(t5, that.t5)
                    && Objects.equals(t6, that.t6)
                    && Objects.equals(t7, that.t7)
                    && Objects.equals(t8, that.t8)
                    && Objects.equals(t9, that.t9)
                    && Objects.equals(t10, that.t10);
        }

        @Override
        public int hashCode() {
            return Objects.hash(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10);
        }

        @Override
        public String toString() {
            return "P10[t1=" + t1
                    + ", t2=" + t2
                    + ", t3=" + t3
                    + ", t4=" + t4
                    + ", t5=" + t5
                    + ", t6=" + t6
                    + ", t7=" + t7
                    + ", t8=" + t8
                    + ", t9=" + t9
                    + ", t10=" + t10
                    + "]";
        }

        public <T11> P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> and(final App<F, T11> t11) {
            return new P11<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11);
        }

        public <T11, T12> P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final P2<F, T11, T12> p) {
            return new P12<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, p.t1, p.t2);
        }

        public <T11, T12, T13> P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final P3<F, T11, T12, T13> p) {
            return new P13<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, p.t1, p.t2, p.t3);
        }

        public <T11, T12, T13, T14> P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final P4<F, T11, T12, T13, T14> p) {
            return new P14<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, p.t1, p.t2, p.t3, p.t4);
        }

        public <T11, T12, T13, T14, T15> P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final P5<F, T11, T12, T13, T14, T15> p) {
            return new P15<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, p.t1, p.t2, p.t3, p.t4, p.t5);
        }

        public <T11, T12, T13, T14, T15, T16> P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final P6<F, T11, T12, T13, T14, T15, T16> p) {
            return new P16<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6);
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R>> function) {
            return instance.ap10(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10);
        }
    }

    final class P11<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> {

        public final App<F, T1> t1;
        public final App<F, T2> t2;
        public final App<F, T3> t3;
        public final App<F, T4> t4;
        public final App<F, T5> t5;
        public final App<F, T6> t6;
        public final App<F, T7> t7;
        public final App<F, T8> t8;
        public final App<F, T9> t9;
        public final App<F, T10> t10;
        public final App<F, T11> t11;

        public P11(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
            this.t10 = t10;
            this.t11 = t11;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof P11)) return false;
            final P11<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> that = (P11<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
            return Objects.equals(t1, that.t1)
                    && Objects.equals(t2, that.t2)
                    && Objects.equals(t3, that.t3)
                    && Objects.equals(t4, that.t4)
                    && Objects.equals(t5, that.t5)
                    && Objects.equals(t6, that.t6)
                    && Objects.equals(t7, that.t7)
                    && Objects.equals(t8, that.t8)
                    && Objects.equals(t9, that.t9)
                    && Objects.equals(t10, that.t10)
                    && Objects.equals(t11, that.t11);
        }

        @Override
        public int hashCode() {
            return Objects.hash(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11);
        }

        @Override
        public String toString() {
            return "P11[t1=" + t1
                    + ", t2=" + t2
                    + ", t3=" + t3
                    + ", t4=" + t4
                    + ", t5=" + t5
                    + ", t6=" + t6
                    + ", t7=" + t7
                    + ", t8=" + t8
                    + ", t9=" + t9
                    + ", t10=" + t10
                    + ", t11=" + t11
                    + "]";
        }

        public <T12> P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final App<F, T12> t12) {
            return new P12<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12);
        }

        public <T12, T13> P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final P2<F, T12, T13> p) {
            return new P13<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, p.t1, p.t2);
        }

        public <T12, T13, T14> P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final P3<F, T12, T13, T14> p) {
            return new P14<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, p.t1, p.t2, p.t3);
        }

        public <T12, T13, T14, T15> P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final P4<F, T12, T13, T14, T15> p) {
            return new P15<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, p.t1, p.t2, p.t3, p.t4);
        }

        public <T12, T13, T14, T15, T16> P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final P5<F, T12, T13, T14, T15, T16> p) {
            return new P16<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, p.t1, p.t2, p.t3, p.t4, p.t5);
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R>> function) {
            return instance.ap11(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11);
        }
    }

    final class P12<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> {

        public final App<F, T1> t1;
        public final App<F, T2> t2;
        public final App<F, T3> t3;
        public final App<F, T4> t4;
        public final App<F, T5> t5;
        public final App<F, T6> t6;
        public final App<F, T7> t7;
        public final App<F, T8> t8;
        public final App<F, T9> t9;
        public final App<F, T10> t10;
        public final App<F, T11> t11;
        public final App<F, T12> t12;

        public P12(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
            this.t10 = t10;
            this.t11 = t11;
            this.t12 = t12;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof P12)) return false;
            final P12<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> that = (P12<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
            return Objects.equals(t1, that.t1)
                    && Objects.equals(t2, that.t2)
                    && Objects.equals(t3, that.t3)
                    && Objects.equals(t4, that.t4)
                    && Objects.equals(t5, that.t5)
                    && Objects.equals(t6, that.t6)
                    && Objects.equals(t7, that.t7)
                    && Objects.equals(t8, that.t8)
                    && Objects.equals(t9, that.t9)
                    && Objects.equals(t10, that.t10)
                    && Objects.equals(t11, that.t11)
                    && Objects.equals(t12, that.t12);
        }

        @Override
        public int hashCode() {
            return Objects.hash(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12);
        }

        @Override
        public String toString() {
            return "P12[t1=" + t1
                    + ", t2=" + t2
                    + ", t3=" + t3
                    + ", t4=" + t4
                    + ", t5=" + t5
                    + ", t6=" + t6
                    + ", t7=" + t7
                    + ", t8=" + t8
                    + ", t9=" + t9
                    + ", t10=" + t10
                    + ", t11=" + t11
                    + ", t12=" + t12
                    + "]";
        }

        public <T13> P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final App<F, T13> t13) {
            return new P13<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13);
        }

        public <T13, T14> P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final P2<F, T13, T14> p) {
            return new P14<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, p.t1, p.t2);
        }

        public <T13, T14, T15> P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final P3<F, T13, T14, T15> p) {
            return new P15<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, p.t1, p.t2, p.t3);
        }

        public <T13, T14, T15, T16> P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final P4<F, T13, T14, T15, T16> p) {
            return new P16<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, p.t1, p.t2, p.t3, p.t4);
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R>> function) {
            return instance.ap12(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12);
        }
    }

    final class P13<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> {

        public final App<F, T1> t1;
        public final App<F, T2> t2;
        public final App<F, T3> t3;
        public final App<F, T4> t4;
        public final App<F, T5> t5;
        public final App<F, T6> t6;
        public final App<F, T7> t7;
        public final App<F, T8> t8;
        public final App<F, T9> t9;
        public final App<F, T10> t10;
        public final App<F, T11> t11;
        public final App<F, T12> t12;
        public final App<F, T13> t13;

        public P13(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
            this.t10 = t10;
            this.t11 = t11;
            this.t12 = t12;
            this.t13 = t13;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof P13)) return false;
            final P13<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> that = (P13<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
            return Objects.equals(t1, that.t1)
                    && Objects.equals(t2, that.t2)
                    && Objects.equals(t3, that.t3)
                    && Objects.equals(t4, that.t4)
                    && Objects.equals(t5, that.t5)
                    && Objects.equals(t6, that.t6)
                    && Objects.equals(t7, that.t7)
                    && Objects.equals(t8, that.t8)
                    && Objects.equals(t9, that.t9)
                    && Objects.equals(t10, that.t10)
                    && Objects.equals(t11, that.t11)
                    && Objects.equals(t12, that.t12)
                    && Objects.equals(t13, that.t13);
        }

        @Override
        public int hashCode() {
            return Objects.hash(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13);
        }

        @Override
        public String toString() {
            return "P13[t1=" + t1
                    + ", t2=" + t2
                    + ", t3=" + t3
                    + ", t4=" + t4
                    + ", t5=" + t5
                    + ", t6=" + t6
                    + ", t7=" + t7
                    + ", t8=" + t8
                    + ", t9=" + t9
                    + ", t10=" + t10
                    + ", t11=" + t11
                    + ", t12=" + t12
                    + ", t13=" + t13
                    + "]";
        }

        public <T14> P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final App<F, T14> t14) {
            return new P14<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14);
        }

        public <T14, T15> P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final P2<F, T14, T15> p) {
            return new P15<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, p.t1, p.t2);
        }

        public <T14, T15, T16> P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final P3<F, T14, T15, T16> p) {
            return new P16<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, p.t1, p.t2, p.t3);
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R>> function) {
            return instance.ap13(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13);
        }
    }

    final class P14<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> {

        public final App<F, T1> t1;
        public final App<F, T2> t2;
        public final App<F, T3> t3;
        public final App<F, T4> t4;
        public final App<F, T5> t5;
        public final App<F, T6> t6;
        public final App<F, T7> t7;
        public final App<F, T8> t8;
        public final App<F, T9> t9;
        public final App<F, T10> t10;
        public final App<F, T11> t11;
        public final App<F, T12> t12;
        public final App<F, T13> t13;
        public final App<F, T14> t14;

        public P14(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
            this.t10 = t10;
            this.t11 = t11;
            this.t12 = t12;
            this.t13 = t13;
            this.t14 = t14;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof P14)) return false;
            final P14<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> that = (P14<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
            return Objects.equals(t1, that.t1)
                    && Objects.equals(t2, that.t2)
                    && Objects.equals(t3, that.t3)
                    && Objects.equals(t4, that.t4)
                    && Objects.equals(t5, that.t5)
                    && Objects.equals(t6, that.t6)
                    && Objects.equals(t7, that.t7)
                    && Objects.equals(t8, that.t8)
                    && Objects.equals(t9, that.t9)
                    && Objects.equals(t10, that.t10)
                    && Objects.equals(t11, that.t11)
                    && Objects.equals(t12, that.t12)
                    && Objects.equals(t13, that.t13)
                    && Objects.equals(t14, that.t14);
        }

        @Override
        public int hashCode() {
            return Objects.hash(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14);
        }

        @Override
        public String toString() {
            return "P14[t1=" + t1
                    + ", t2=" + t2
                    + ", t3=" + t3
                    + ", t4=" + t4
                    + ", t5=" + t5
                    + ", t6=" + t6
                    + ", t7=" + t7
                    + ", t8=" + t8
                    + ", t9=" + t9
                    + ", t10=" + t10
                    + ", t11=" + t11
                    + ", t12=" + t12
                    + ", t13=" + t13
                    + ", t14=" + t14
                    + "]";
        }

        public <T15> P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final App<F, T15> t15) {
            return new P15<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15);
        }

        public <T15, T16> P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final P2<F, T15, T16> p) {
            return new P16<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, p.t1, p.t2);
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R>> function) {
            return instance.ap14(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14);
        }
    }

    final class P15<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> {

        public final App<F, T1> t1;
        public final App<F, T2> t2;
        public final App<F, T3> t3;
        public final App<F, T4> t4;
        public final App<F, T5> t5;
        public final App<F, T6> t6;
        public final App<F, T7> t7;
        public final App<F, T8> t8;
        public final App<F, T9> t9;
        public final App<F, T10> t10;
        public final App<F, T11> t11;
        public final App<F, T12> t12;
        public final App<F, T13> t13;
        public final App<F, T14> t14;
        public final App<F, T15> t15;

        public P15(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
            this.t10 = t10;
            this.t11 = t11;
            this.t12 = t12;
            this.t13 = t13;
            this.t14 = t14;
            this.t15 = t15;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof P15)) return false;
            final P15<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> that = (P15<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
            return Objects.equals(t1, that.t1)
                    && Objects.equals(t2, that.t2)
                    && Objects.equals(t3, that.t3)
                    && Objects.equals(t4, that.t4)
                    && Objects.equals(t5, that.t5)
                    && Objects.equals(t6, that.t6)
                    && Objects.equals(t7, that.t7)
                    && Objects.equals(t8, that.t8)
                    && Objects.equals(t9, that.t9)
                    && Objects.equals(t10, that.t10)
                    && Objects.equals(t11, that.t11)
                    && Objects.equals(t12, that.t12)
                    && Objects.equals(t13, that.t13)
                    && Objects.equals(t14, that.t14)
                    && Objects.equals(t15, that.t15);
        }

        @Override
        public int hashCode() {
            return Objects.hash(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15);
        }

        @Override
        public String toString() {
            return "P15[t1=" + t1
                    + ", t2=" + t2
                    + ", t3=" + t3
                    + ", t4=" + t4
                    + ", t5=" + t5
                    + ", t6=" + t6
                    + ", t7=" + t7
                    + ", t8=" + t8
                    + ", t9=" + t9
                    + ", t10=" + t10
                    + ", t11=" + t11
                    + ", t12=" + t12
                    + ", t13=" + t13
                    + ", t14=" + t14
                    + ", t15=" + t15
                    + "]";
        }

        public <T16> P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final App<F, T16> t16) {
            return new P16<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16);
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R>> function) {
            return instance.ap15(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15);
        }
    }

    final class P16<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> {

        public final App<F, T1> t1;
        public final App<F, T2> t2;
        public final App<F, T3> t3;
        public final App<F, T4> t4;
        public final App<F, T5> t5;
        public final App<F, T6> t6;
        public final App<F, T7> t7;
        public final App<F, T8> t8;
        public final App<F, T9> t9;
        public final App<F, T10> t10;
        public final App<F, T11> t11;
        public final App<F, T12> t12;
        public final App<F, T13> t13;
        public final App<F, T14> t14;
        public final App<F, T15> t15;
        public final App<F, T16> t16;

        public P16(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
            this.t10 = t10;
            this.t11 = t11;
            this.t12 = t12;
            this.t13 = t13;
            this.t14 = t14;
            this.t15 = t15;
            this.t16 = t16;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof P16)) return false;
            final P16<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> that = (P16<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
            return Objects.equals(t1, that.t1)
                    && Objects.equals(t2, that.t2)
                    && Objects.equals(t3, that.t3)
                    && Objects.equals(t4, that.t4)
                    && Objects.equals(t5, that.t5)
                    && Objects.equals(t6, that.t6)
                    && Objects.equals(t7, that.t7)
                    && Objects.equals(t8, that.t8)
                    && Objects.equals(t9, that.t9)
                    && Objects.equals(t10, that.t10)
                    && Objects.equals(t11, that.t11)
                    && Objects.equals(t12, that.t12)
                    && Objects.equals(t13, that.t13)
                    && Objects.equals(t14, that.t14)
                    && Objects.equals(t15, that.t15)
                    && Objects.equals(t16, that.t16);
        }

        @Override
        public int hashCode() {
            return Objects.hash(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16);
        }

        @Override
        public String toString() {
            return "P16[t1=" + t1
                    + ", t2=" + t2
                    + ", t3=" + t3
                    + ", t4=" + t4
                    + ", t5=" + t5
                    + ", t6=" + t6
                    + ", t7=" + t7
                    + ", t8=" + t8
                    + ", t9=" + t9
                    + ", t10=" + t10
                    + ", t11=" + t11
                    + ", t12=" + t12
                    + ", t13=" + t13
                    + ", t14=" + t14
                    + ", t15=" + t15
                    + ", t16=" + t16
                    + "]";
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R>> function) {
            return instance.ap16(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16);
        }
    }
}
