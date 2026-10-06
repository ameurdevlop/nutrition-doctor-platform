import {
  MAT_SELECT_CONFIG,
  MAT_SELECT_SCROLL_STRATEGY,
  MAT_SELECT_SCROLL_STRATEGY_PROVIDER,
  MAT_SELECT_SCROLL_STRATEGY_PROVIDER_FACTORY,
  MAT_SELECT_TRIGGER,
  MatSelect,
  MatSelectChange,
  MatSelectModule,
  MatSelectTrigger
} from "./chunk-TIXURX6K.js";
import "./chunk-WX7224QV.js";
import "./chunk-MD2KHHXU.js";
import {
  MatError,
  MatFormField,
  MatHint,
  MatLabel,
  MatPrefix,
  MatSuffix
} from "./chunk-2FY53WXZ.js";
import "./chunk-CMLFWBCH.js";
import {
  MatOptgroup,
  MatOption
} from "./chunk-3KPZRNQC.js";
import "./chunk-SOG7DEGS.js";
import "./chunk-B3ZNF3AV.js";
import "./chunk-OHHOCZDH.js";
import "./chunk-PHLOEZYO.js";
import "./chunk-6UZZXQQ2.js";
import "./chunk-KFL2SYBL.js";
import "./chunk-STU6H3XF.js";
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

// node_modules/@angular/material/fesm2022/select.mjs
var matSelectAnimations = {
  // Represents
  // trigger('transformPanelWrap', [
  //   transition('* => void', query('@transformPanel', [animateChild()], {optional: true})),
  // ])
  /**
   * This animation ensures the select's overlay panel animation (transformPanel) is called when
   * closing the select.
   * This is needed due to https://github.com/angular/angular/issues/23302
   */
  transformPanelWrap: {
    type: 7,
    name: "transformPanelWrap",
    definitions: [{
      type: 1,
      expr: "* => void",
      animation: {
        type: 11,
        selector: "@transformPanel",
        animation: [{
          type: 9,
          options: null
        }],
        options: {
          optional: true
        }
      },
      options: null
    }],
    options: {}
  },
  // Represents
  // trigger('transformPanel', [
  //   state(
  //     'void',
  //     style({
  //       opacity: 0,
  //       transform: 'scale(1, 0.8)',
  //     }),
  //   ),
  //   transition(
  //     'void => showing',
  //     animate(
  //       '120ms cubic-bezier(0, 0, 0.2, 1)',
  //       style({
  //         opacity: 1,
  //         transform: 'scale(1, 1)',
  //       }),
  //     ),
  //   ),
  //   transition('* => void', animate('100ms linear', style({opacity: 0}))),
  // ])
  /** This animation transforms the select's overlay panel on and off the page. */
  transformPanel: {
    type: 7,
    name: "transformPanel",
    definitions: [{
      type: 0,
      name: "void",
      styles: {
        type: 6,
        styles: {
          opacity: 0,
          transform: "scale(1, 0.8)"
        },
        offset: null
      }
    }, {
      type: 1,
      expr: "void => showing",
      animation: {
        type: 4,
        styles: {
          type: 6,
          styles: {
            opacity: 1,
            transform: "scale(1, 1)"
          },
          offset: null
        },
        timings: "120ms cubic-bezier(0, 0, 0.2, 1)"
      },
      options: null
    }, {
      type: 1,
      expr: "* => void",
      animation: {
        type: 4,
        styles: {
          type: 6,
          styles: {
            opacity: 0
          },
          offset: null
        },
        timings: "100ms linear"
      },
      options: null
    }],
    options: {}
  }
};
export {
  MAT_SELECT_CONFIG,
  MAT_SELECT_SCROLL_STRATEGY,
  MAT_SELECT_SCROLL_STRATEGY_PROVIDER,
  MAT_SELECT_SCROLL_STRATEGY_PROVIDER_FACTORY,
  MAT_SELECT_TRIGGER,
  MatError,
  MatFormField,
  MatHint,
  MatLabel,
  MatOptgroup,
  MatOption,
  MatPrefix,
  MatSelect,
  MatSelectChange,
  MatSelectModule,
  MatSelectTrigger,
  MatSuffix,
  matSelectAnimations
};
//# sourceMappingURL=@angular_material_select.js.map
