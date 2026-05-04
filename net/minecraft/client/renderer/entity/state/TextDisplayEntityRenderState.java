package net.minecraft.client.renderer.entity.state;

import net.minecraft.world.entity.Display.TextDisplay.CachedInfo;
import net.minecraft.world.entity.Display.TextDisplay.TextRenderState;
import org.jspecify.annotations.Nullable;

public class TextDisplayEntityRenderState extends DisplayEntityRenderState {
	@Nullable
	public TextRenderState textRenderState;
	@Nullable
	public CachedInfo cachedInfo;

	@Override
	public boolean hasSubState() {
		return this.textRenderState != null;
	}
}
