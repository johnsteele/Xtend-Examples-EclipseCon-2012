package beer;

import beer.BottleSupport;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.junit.Test;

@SuppressWarnings("all")
public class BottleSong {
  @Test
  public void singIt() {
    CharSequence _singTheSong = this.singTheSong(99);
    InputOutput.<CharSequence>println(_singTheSong);
  }
  
  public CharSequence singTheSong(final int all) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Iterable<Integer> _upTo = IntegerExtensions.upTo(all, 1);
      for(final Integer i : _upTo) {
        String _Bottles = BottleSupport.Bottles((i).intValue());
        _builder.append(_Bottles, "");
        _builder.append(" of beer on the wall, ");
        String _bottles = BottleSupport.bottles((i).intValue());
        _builder.append(_bottles, "");
        _builder.append(" of beer.");
        _builder.newLineIfNotEmpty();
        _builder.append("Take one down and pass it around, ");
        int _minus = ((i).intValue() - 1);
        String _bottles_1 = BottleSupport.bottles(_minus);
        _builder.append(_bottles_1, "");
        _builder.append(" of beer on the wall.");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    _builder.append("No more bottles of beer on the wall, no more bottles of beer.");
    _builder.newLine();
    _builder.append("Go to the store and buy some more, ");
    String _bottles_2 = BottleSupport.bottles(all);
    _builder.append(_bottles_2, "");
    _builder.append(" of beer on the wall.");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
