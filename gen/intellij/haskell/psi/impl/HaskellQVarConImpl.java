// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static intellij.haskell.psi.HaskellTypes.*;
import intellij.haskell.psi.*;

public class HaskellQVarConImpl extends HaskellCompositeElementImpl implements HaskellQVarCon {

  public HaskellQVarConImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HaskellVisitor visitor) {
    visitor.visitQVarCon(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HaskellVisitor) accept((HaskellVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HaskellConsym getConsym() {
    return PsiTreeUtil.getChildOfType(this, HaskellConsym.class);
  }

  @Override
  @Nullable
  public HaskellQCon getQCon() {
    return PsiTreeUtil.getChildOfType(this, HaskellQCon.class);
  }

  @Override
  @Nullable
  public HaskellQualifier getQualifier() {
    return PsiTreeUtil.getChildOfType(this, HaskellQualifier.class);
  }

  @Override
  @Nullable
  public HaskellVarid getVarid() {
    return PsiTreeUtil.getChildOfType(this, HaskellVarid.class);
  }

  @Override
  @Nullable
  public HaskellVarsym getVarsym() {
    return PsiTreeUtil.getChildOfType(this, HaskellVarsym.class);
  }

  public String getName() {
    return HaskellPsiImplUtil.getName(this);
  }

  public HaskellNamedElement getIdentifierElement() {
    return HaskellPsiImplUtil.getIdentifierElement(this);
  }

}
