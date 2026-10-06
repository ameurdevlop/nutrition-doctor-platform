import {
  MAT_TOOLTIP_DEFAULT_OPTIONS,
  MAT_TOOLTIP_DEFAULT_OPTIONS_FACTORY,
  MAT_TOOLTIP_SCROLL_STRATEGY,
  MAT_TOOLTIP_SCROLL_STRATEGY_FACTORY,
  MAT_TOOLTIP_SCROLL_STRATEGY_FACTORY_PROVIDER,
  MatTooltip,
  MatTooltipModule,
  SCROLL_THROTTLE_MS,
  TOOLTIP_PANEL_CLASS,
  TooltipComponent,
  getMatTooltipInvalidPositionError
} from "./chunk-U5743YUX.js";
import "./chunk-CQDVJKDT.js";
import "./chunk-5DOQBM3R.js";
import "./chunk-3OCAPHJG.js";
import "./chunk-PJVXTM5E.js";
import "./chunk-DNPMAIS3.js";
import "./chunk-3FCHB4UG.js";
import "./chunk-QU37PDTI.js";
import "./chunk-ICTHIRJG.js";
import "./chunk-C5JLKL7C.js";
import "./chunk-L5M6JFEJ.js";
import "./chunk-42FJBLFI.js";
import "./chunk-ZUECRCB4.js";
import "./chunk-2O4WY5GE.js";
import "./chunk-2RB2QK2N.js";
import "./chunk-GMRBXDFH.js";
import "./chunk-Y6K7JZE3.js";
import "./chunk-KXC4HKWR.js";
import "./chunk-GV5LUSDY.js";
import "./chunk-DG6N4IH3.js";
import "./chunk-X7USGXFN.js";
import "./chunk-TWSXFKUE.js";
import "./chunk-RF2MG2GI.js";
import "./chunk-PC56K36H.js";
import "./chunk-JLYF3IHM.js";
import "./chunk-BRP5S7E5.js";
import "./chunk-VAXRHV5J.js";
import "./chunk-FYIIPBGX.js";
import "./chunk-V4BLBTLE.js";
import "./chunk-6BIU55K4.js";
import "./chunk-KBUIKKCC.js";

// node_modules/@angular/material/fesm2022/tooltip.mjs
var matTooltipAnimations = {
  // Represents:
  // trigger('state', [
  //   state('initial, void, hidden', style({opacity: 0, transform: 'scale(0.8)'})),
  //   state('visible', style({transform: 'scale(1)'})),
  //   transition('* => visible', animate('150ms cubic-bezier(0, 0, 0.2, 1)')),
  //   transition('* => hidden', animate('75ms cubic-bezier(0.4, 0, 1, 1)')),
  // ])
  /** Animation that transitions a tooltip in and out. */
  tooltipState: {
    type: 7,
    name: "state",
    definitions: [{
      type: 0,
      name: "initial, void, hidden",
      styles: {
        type: 6,
        styles: {
          opacity: 0,
          transform: "scale(0.8)"
        },
        offset: null
      }
    }, {
      type: 0,
      name: "visible",
      styles: {
        type: 6,
        styles: {
          transform: "scale(1)"
        },
        offset: null
      }
    }, {
      type: 1,
      expr: "* => visible",
      animation: {
        type: 4,
        styles: null,
        timings: "150ms cubic-bezier(0, 0, 0.2, 1)"
      },
      options: null
    }, {
      type: 1,
      expr: "* => hidden",
      animation: {
        type: 4,
        styles: null,
        timings: "75ms cubic-bezier(0.4, 0, 1, 1)"
      },
      options: null
    }],
    options: {}
  }
};
export {
  MAT_TOOLTIP_DEFAULT_OPTIONS,
  MAT_TOOLTIP_DEFAULT_OPTIONS_FACTORY,
  MAT_TOOLTIP_SCROLL_STRATEGY,
  MAT_TOOLTIP_SCROLL_STRATEGY_FACTORY,
  MAT_TOOLTIP_SCROLL_STRATEGY_FACTORY_PROVIDER,
  MatTooltip,
  MatTooltipModule,
  SCROLL_THROTTLE_MS,
  TOOLTIP_PANEL_CLASS,
  TooltipComponent,
  getMatTooltipInvalidPositionError,
  matTooltipAnimations
};
//# sourceMappingURL=@angular_material_tooltip.js.map
