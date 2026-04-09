package Utils;

import java.util.Objects;

/**
 * Utility: Custom Pair Class
 * Use Case: Sorting pairs naturally, or using pairs as keys in HashMaps/HashSets.
 */
class IntPair implements Comparable<IntPair> {
    public int first;
    public int second;

    public IntPair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    // Default sorting: Sort by 'first'. If tied, sort by 'second'.
    @Override
    public int compareTo(IntPair other) {
        if (this.first == other.first) {
            return Integer.compare(this.second, other.second);
        }
        return Integer.compare(this.first, other.first);
    }

    // Required to use IntPair as a key in HashSet or HashMap
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntPair intPair = (IntPair) o;
        return first == intPair.first && second == intPair.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
