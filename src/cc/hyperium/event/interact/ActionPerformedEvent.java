/*
 *       Copyright (C) 2018-present Hyperium <https://hyperium.cc/>
 *
 *       This program is free software: you can redistribute it and/or modify
 *       it under the terms of the GNU Lesser General Public License as published
 *       by the Free Software Foundation, either version 3 of the License, or
 *       (at your option) any later version.
 *
 *       This program is distributed in the hope that it will be useful,
 *       but WITHOUT ANY WARRANTY; without even the implied warranty of
 *       MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *       GNU Lesser General Public License for more details.
 *
 *       You should have received a copy of the GNU Lesser General Public License
 *       along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package cc.hyperium.event.interact;

import cc.hyperium.event.CancellableEvent;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

public class ActionPerformedEvent extends CancellableEvent {

    private GuiScreen screen;
    private GuiButton button;

    public ActionPerformedEvent(GuiScreen screen, GuiButton button) {
        this.screen = screen;
        this.button = button;
    }

    public GuiScreen getScreen() {
        return screen;
    }

    public GuiButton getButton() {
        return button;
    }
}
