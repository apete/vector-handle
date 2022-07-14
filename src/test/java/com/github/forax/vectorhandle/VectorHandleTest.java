package com.github.forax.vectorhandle;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VectorHandleTest {

    @Test
    public void applyDD() {
        var vh = VectorHandle.of(MethodHandles.lookup());
        var dest = new double[3];
        var a = new double[] { 1, 2, 3 };
        vh.apply(dest, a, x -> -x);
        Assertions.assertArrayEquals(new double[] { -1, -2, -3 }, dest);
    }

    @Test
    public void applyDDD() {
        var vh = VectorHandle.of(MethodHandles.lookup());
        var dest = new double[4];
        var a = new double[] { 1, 2, 3, 4 };
        var b = new double[] { 4, 4, 4, 4 };
        vh.apply(dest, a, b, (x, y) -> x + y * 2);
        Assertions.assertArrayEquals(new double[] { 9, 10, 11, 12 }, dest);
    }

    @Test
    public void applyDDDHuge() {
        var vh = VectorHandle.of(MethodHandles.lookup());
        var dest = new double[10_000];
        var a = new double[10_000];
        Arrays.fill(a, 2);
        var b = new double[10_000];
        Arrays.fill(b, 3);
        vh.apply(dest, a, b, Math::min);
        var expected = new double[10_000];
        Arrays.fill(expected, 2);
        Assertions.assertArrayEquals(expected, dest);
    }

    @Test
    public void applyDDHuge() {
        var vh = VectorHandle.of(MethodHandles.lookup());
        var dest = new double[10_000];
        var a = new double[10_000];
        Arrays.fill(a, 1);
        vh.apply(dest, a, x -> -x);
        var expected = new double[10_000];
        Arrays.fill(expected, -1);
        Assertions.assertArrayEquals(expected, dest);
    }

    @Test
    public void applyFF() {
        var vh = VectorHandle.of(MethodHandles.lookup());
        var dest = new float[10];
        var a = new float[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        vh.apply(dest, a, x -> -x);
        Assertions.assertArrayEquals(new float[] { -1, -2, -3, -4, -5, -6, -7, -8, -9, -10 }, dest);
    }

    @Test
    public void applyFFF() {
        var vh = VectorHandle.of(MethodHandles.lookup());
        var dest = new float[4];
        var a = new float[] { 1, 2, 3, 4 };
        var b = new float[] { 4, 4, 4, 4 };
        vh.apply(dest, a, b, (x, y) -> x + y * 2);
        Assertions.assertArrayEquals(new float[] { 9, 10, 11, 12 }, dest);
    }

    @Test
    public void applyFFFHuge() {
        var vh = VectorHandle.of(MethodHandles.lookup());
        var dest = new float[10_000];
        var a = new float[10_000];
        Arrays.fill(a, 2);
        var b = new float[10_000];
        Arrays.fill(b, 3);
        vh.apply(dest, a, b, Math::min);
        var expected = new float[10_000];
        Arrays.fill(expected, 2);
        Assertions.assertArrayEquals(expected, dest);
    }

    @Test
    public void applyFFHuge() {
        var vh = VectorHandle.of(MethodHandles.lookup());
        var dest = new float[10_000];
        var a = new float[10_000];
        Arrays.fill(a, 1);
        vh.apply(dest, a, x -> -x);
        var expected = new float[10_000];
        Arrays.fill(expected, -1);
        Assertions.assertArrayEquals(expected, dest);
    }

    @Test
    public void applyII() {
        var vh = VectorHandle.of(MethodHandles.lookup());
        var dest = new int[10];
        var a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        vh.apply(dest, a, x -> -x);
        Assertions.assertArrayEquals(new int[] { -1, -2, -3, -4, -5, -6, -7, -8, -9, -10 }, dest);
    }

    @Test
    public void applyIIHuge() {
        var vh = VectorHandle.of(MethodHandles.lookup());
        var dest = new int[10_000];
        var a = new int[10_000];
        Arrays.fill(a, 1);
        vh.apply(dest, a, x -> -x);
        var expected = new int[10_000];
        Arrays.fill(expected, -1);
        Assertions.assertArrayEquals(expected, dest);
    }

    @Test
    public void applyIII() {
        var vh = VectorHandle.of(MethodHandles.lookup());
        var dest = new int[4];
        var a = new int[] { 1, 2, 3, 4 };
        var b = new int[] { 4, 4, 4, 4 };
        vh.apply(dest, a, b, (x, y) -> x + y * 2);
        Assertions.assertArrayEquals(new int[] { 9, 10, 11, 12 }, dest);
    }

    @Test
    public void applyIIIHuge() {
        var vh = VectorHandle.of(MethodHandles.lookup());
        var dest = new int[10_000];
        var a = new int[10_000];
        Arrays.fill(a, 2);
        var b = new int[10_000];
        Arrays.fill(b, 3);
        vh.apply(dest, a, b, Math::min);
        var expected = new int[10_000];
        Arrays.fill(expected, 2);
        Assertions.assertArrayEquals(expected, dest);
    }

    @Test
    public void applyLL() {
        var vh = VectorHandle.of(MethodHandles.lookup());
        var dest = new long[3];
        var a = new long[] { 1, 2, 3 };
        vh.apply(dest, a, x -> -x);
        Assertions.assertArrayEquals(new long[] { -1, -2, -3 }, dest);
    }

    @Test
    public void applyLLHuge() {
        var vh = VectorHandle.of(MethodHandles.lookup());
        var dest = new long[10_000];
        var a = new long[10_000];
        Arrays.fill(a, 1);
        vh.apply(dest, a, x -> -x);
        var expected = new long[10_000];
        Arrays.fill(expected, -1);
        Assertions.assertArrayEquals(expected, dest);
    }

    @Test
    public void applyLLL() {
        var vh = VectorHandle.of(MethodHandles.lookup());
        var dest = new long[4];
        var a = new long[] { 1, 2, 3, 4 };
        var b = new long[] { 4, 4, 4, 4 };
        vh.apply(dest, a, b, (x, y) -> x + y * 2);
        Assertions.assertArrayEquals(new long[] { 9, 10, 11, 12 }, dest);
    }

    @Test
    public void applyLLLHuge() {
        var vh = VectorHandle.of(MethodHandles.lookup());
        var dest = new long[10_000];
        var a = new long[10_000];
        Arrays.fill(a, 2);
        var b = new long[10_000];
        Arrays.fill(b, 3);
        vh.apply(dest, a, b, Math::min);
        var expected = new long[10_000];
        Arrays.fill(expected, 2);
        Assertions.assertArrayEquals(expected, dest);
    }

}
